# Guia de Instalação e Configuração do ArgoCD

Este documento descreve os passos para instalar e configurar o ArgoCD em seu cluster EKS, bem como integrá-lo ao pipeline de CI/CD.

## 1. Instalação do ArgoCD no EKS

Para instalar o ArgoCD, siga a documentação oficial. Geralmente, envolve a aplicação de manifestos YAML no cluster EKS:

```bash
kubectl create namespace argocd
kubeclt apply -n argocd -f https://raw.githubusercontent.com/argoproj/argo-cd/stable/manifests/install.yaml
```

Após a instalação, você precisará expor a UI do ArgoCD e obter a senha inicial.

## 2. Configuração do ArgoCD Application

O ArgoCD gerencia as aplicações através de recursos `Application`. Abaixo está um exemplo de manifesto `Application` que o ArgoCD usaria para monitorar o repositório GitOps e implantar o microserviço no cluster EKS.

```yaml
apiVersion: argoproj.io/v1alpha1
kind: Application
metadata:
  name: microservice-app
  namespace: argocd
spec:
  project: default
  source:
    repoURL: <URL_DO_SEU_REPOSITORIO_GITOPS> # Ex: https://github.com/seu-usuario/aws-devops-advanced.git
    targetRevision: HEAD
    path: gitops/kubernetes
  destination:
    server: https://kubernetes.default.svc
    namespace: default
  syncPolicy:
    automated:
      prune: true
      selfHeal: true
    syncOptions:
      - CreateNamespace=true
```

Salve este manifesto como `argocd-application.yaml` e aplique-o ao seu cluster EKS:

```bash
kubeclt apply -f argocd-application.yaml -n argocd
```

## 3. Integração com o CodePipeline (Atualização de Imagem)

No cenário GitOps, o CodePipeline não implanta diretamente no EKS. Em vez disso, ele atualiza o repositório GitOps com a nova tag da imagem Docker. O ArgoCD, que está monitorando esse repositório, detectará a mudança e aplicará a nova versão ao cluster EKS.

Para isso, o estágio de `Deploy` no CodePipeline precisaria de uma ação que atualize o `kustomization.yaml` (ou `deployment.yaml`) no repositório GitOps com a nova tag da imagem. Isso pode ser feito com um estágio `CodeBuild` adicional que:

1.  Clona o repositório GitOps.
2.  Atualiza o `kustomization.yaml` (ou `deployment.yaml`) com a nova tag da imagem gerada pelo estágio `BuildAndPush`.
3.  Faz commit e push da alteração para o repositório GitOps.

Exemplo de `buildspec` para atualização do manifesto:

```yaml
version: 0.2

phases:
  install:
    commands:
      - git config --global user.email "codebuild@example.com"
      - git config --global user.name "CodeBuild"
  build:
    commands:
      - IMAGE_TAG=$(cat imageDetail.json | jq -r ".ImageURI" | cut -d ":" -f 2)
      - git clone https://<SEU_USUARIO_GITHUB>:<SEU_GITHUB_TOKEN>@github.com/<SEU_USUARIO_GITHUB>/<SEU_REPOSITORIO_GITOPS>.git
      - cd <SEU_REPOSITORIO_GITOPS>/gitops/kubernetes
      - sed -i "s|newTag: .*|newTag: $IMAGE_TAG|" kustomization.yaml
      - git add kustomization.yaml
      - git commit -m "Update image tag to $IMAGE_TAG via CodePipeline"
      - git push
```

**Nota**: O `GitHubToken` deve ser armazenado de forma segura (e.g., AWS Secrets Manager) e passado como variável de ambiente para o CodeBuild.
