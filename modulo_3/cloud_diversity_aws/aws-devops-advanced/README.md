# Exemplo Avançado de Pipeline DevOps na AWS

Este projeto expande os conceitos básicos de DevOps na AWS, incorporando práticas avançadas para melhorar o desempenho, a confiabilidade e a eficiência de implantações de microserviços em ambientes multiambiente.

## Conceitos Abordados

-   **Pipelines Multiambiente com CodePipeline**: Automação da promoção de versões de código entre ambientes (Desenvolvimento → Homologação → Produção) com aprovações manuais.
-   **GitOps e Integração com Kubernetes (EKS)**: Gerenciamento de implantações em clusters Kubernetes (EKS) usando o paradigma GitOps, onde o estado desejado da infraestrutura e aplicação é declarado no Git.
-   **Implantações Automáticas com Lambda e EventBridge**: Acionamento automático de pipelines com base em eventos, otimizando a resposta a mudanças.
-   **Otimização de Custos em Pipelines de CI/CD**: Utilização de instâncias Spot no CodeBuild para reduzir custos sem comprometer a eficiência.
-   **Monitoramento Avançado com AWS X-Ray**: Rastreamento distribuído para identificar gargalos de desempenho e otimizar microserviços.

## Estrutura do Projeto

```
aws-devops-advanced/
├── microservices/
│   ├── app.js
│   ├── package.json
│   ├── Dockerfile
│   └── buildspec-docker.yml
├── infrastructure-eks/
│   ├── eks-vpc.yaml
│   ├── eks-iam-roles.yaml
│   ├── eks-cluster.yaml
│   └── ecr-repository.yaml
├── pipeline/
│   ├── multi-env-codepipeline.yaml
│   ├── codebuild-spot.yaml
│   └── codebuild-gitops-updater.yaml
├── gitops/
│   ├── kubernetes/
│   │   ├── deployment.yaml
│   │   ├── service.yaml
│   │   └── kustomization.yaml
│   └── argocd-installation-guide.md
├── automation/
│   └── event-driven-automation.yaml
├── monitoring-xray/
│   └── xray-group.yaml
└── README.md
```

-   `microservices/`: Contém o código-fonte de um microserviço Node.js de exemplo com instrumentação X-Ray, Dockerfile e `buildspec` para construção e push da imagem Docker para o ECR.
-   `infrastructure-eks/`: Templates CloudFormation para provisionar a infraestrutura base do EKS (VPC, IAM Roles, Cluster EKS, ECR).
-   `pipeline/`: Templates CloudFormation para configurar o CodePipeline multiambiente, CodeBuild com Spot Instances e um CodeBuild para atualizar o repositório GitOps.
-   `gitops/`: Manifestos Kubernetes para o microserviço e um guia para instalação e configuração do ArgoCD.
-   `automation/`: Template CloudFormation para automação orientada a eventos com Lambda e EventBridge.
-   `monitoring-xray/`: Template CloudFormation para configurar grupos do AWS X-Ray.

## Pré-requisitos

Antes de iniciar, certifique-se de ter:

1.  Uma conta AWS ativa.
2.  AWS CLI configurada com credenciais de acesso programático.
3.  `kubectl` e `aws-iam-authenticator` instalados e configurados para interagir com clusters EKS.
4.  `jq` instalado para processamento de JSON.
5.  Um repositório GitHub (ou AWS CodeCommit) para o código da aplicação e outro para os manifestos GitOps (pode ser o mesmo para este exemplo, mas recomendado separar em produção).
6.  Um Personal Access Token do GitHub com permissões de `repo` e `workflow` (se usar GitHub Actions) para o CodePipeline acessar seu repositório. **Armazene este token no AWS Secrets Manager e forneça o ARN do Secret para os templates CloudFormation.**

## Guia de Implantação

Siga os passos abaixo para implantar o pipeline e a aplicação na sua conta AWS.

### Passo 1: Clonar o Repositório e Fazer Upload para o GitHub

Clone este repositório para sua máquina local e faça o upload de todo o conteúdo para um novo repositório no GitHub (ex: `aws-devops-advanced`). Este será o repositório principal do seu código e manifestos GitOps.

```bash
git clone <URL_DESTE_REPOSITORIO>
cd aws-devops-advanced
# Crie um novo repositório no GitHub e faça o push do código
```

### Passo 2: Criar Secret no AWS Secrets Manager para o GitHub Token

Crie um secret no AWS Secrets Manager para armazenar seu GitHub Personal Access Token. O nome da chave dentro do secret deve ser `github_token`.

```bash
aws secretsmanager create-secret \
    --name devops-advanced-github-token \
    --secret-string '{"github_token":"<SEU_GITHUB_PERSONAL_ACCESS_TOKEN>"}' \
    --region <SUA_REGIAO_AWS>
```
Anote o `SecretArn` da saída.

### Passo 3: Implantação da Infraestrutura EKS (CloudFormation)

Primeiro, vamos criar os recursos de infraestrutura essenciais para o EKS.

1.  **Criar VPC para EKS:**

    ```bash
    aws cloudformation deploy \
      --template-file infrastructure-eks/eks-vpc.yaml \
      --stack-name devops-advanced-eks-vpc \
      --capabilities CAPABILITY_NAMED_IAM \
      --parameter-overrides EnvironmentName=devops-advanced \
      --region <SUA_REGIAO_AWS>
    ```
    Anote os `VPCId`, `PublicSubnetIds` e `PrivateSubnetIds` da saída.

2.  **Criar IAM Roles para EKS:**

    ```bash
    aws cloudformation deploy \
      --template-file infrastructure-eks/eks-iam-roles.yaml \
      --stack-name devops-advanced-eks-iam-roles \
      --capabilities CAPABILITY_NAMED_IAM \
      --parameter-overrides EnvironmentName=devops-advanced \
      --region <SUA_REGIAO_AWS>
    ```
    Anote os `EKSClusterRoleArn` e `EKSNodeInstanceRoleArn` da saída.

3.  **Criar Cluster EKS e Node Group:**
    **Importante**: Certifique-se de ter um KeyPair EC2 na sua região AWS para o `RemoteAccess` do NodeGroup.

    ```bash
    aws cloudformation deploy \
      --template-file infrastructure-eks/eks-cluster.yaml \
      --stack-name devops-advanced-eks-cluster \
      --capabilities CAPABILITY_NAMED_IAM \
      --parameter-overrides \
        EnvironmentName=devops-advanced \
        VPCId=<VPCId_ANOTADO> \
        PrivateSubnetIds=<PrivateSubnetIds_ANOTADO> \
        EKSClusterRoleArn=<EKSClusterRoleArn_ANOTADO> \
        EKSNodeInstanceRoleArn=<EKSNodeInstanceRoleArn_ANOTADO> \
        NodeInstanceType=t3.medium \
        NodeGroupDesiredCapacity=2 \
        NodeGroupMinCapacity=1 \
        NodeGroupMaxCapacity=3 \
      --region <SUA_REGIAO_AWS>
    ```
    Anote o `EKSClusterName` da saída.

4.  **Criar ECR Repository:**

    ```bash
    aws cloudformation deploy \
      --template-file infrastructure-eks/ecr-repository.yaml \
      --stack-name devops-advanced-ecr \
      --capabilities CAPABILITY_NAMED_IAM \
      --parameter-overrides EnvironmentName=devops-advanced RepositoryName=microservice-app \
      --region <SUA_REGIAO_AWS>
    ```
    Anote os `ECRRepositoryUri` e `ECRRepositoryName` da saída.

### Passo 4: Implantação dos Serviços de Pipeline (CloudFormation)

Agora, vamos configurar o CodeBuild e CodePipeline.

1.  **Criar CodeBuild Project para GitOps Updater:**

    ```bash
    aws cloudformation deploy \
      --template-file pipeline/codebuild-gitops-updater.yaml \
      --stack-name devops-advanced-codebuild-gitops-updater \
      --capabilities CAPABILITY_NAMED_IAM \
      --parameter-overrides \
        EnvironmentName=devops-advanced \
        CodePipelineServiceRoleArn=<CodePipelineServiceRoleArn_ANOTADO_DO_PASSO_3_IAM_ROLES> \
        GitHubOwner=<SEU_USUARIO_GITHUB> \
        GitOpsRepoName=<NOME_DO_SEU_REPOSITORIO_GITOPS> \
        GitHubTokenSecretArn=<SecretArn_ANOTADO_DO_PASSO_2> \
      --region <SUA_REGIAO_AWS>
    ```
    Anote o `CodeBuildProjectGitOpsUpdaterName` da saída.

2.  **Criar CodePipeline Multiambiente:**

    ```bash
    aws cloudformation deploy \
      --template-file pipeline/multi-env-codepipeline.yaml \
      --stack-name devops-advanced-multi-env-codepipeline \
      --capabilities CAPABILITY_NAMED_IAM \
      --parameter-overrides \
        EnvironmentName=devops-advanced \
        CodePipelineServiceRoleArn=<CodePipelineServiceRoleArn_ANOTADO_DO_PASSO_3_IAM_ROLES> \
        CodePipelineArtifactsBucketName=<NOME_DO_BUCKET_S3_PARA_ARTEFATOS> \
        GitHubOwner=<SEU_USUARIO_GITHUB> \
        GitHubRepo=<NOME_DO_SEU_REPOSITORIO_DE_CODIGO> \
        GitHubBranch=main \
        GitHubTokenSecretArn=<SecretArn_ANOTADO_DO_PASSO_2> \
        ECRRepositoryUri=<ECRRepositoryUri_ANOTADO_DO_PASSO_3_ECR> \
        ECRRepositoryName=<ECRRepositoryName_ANOTADO_DO_PASSO_3_ECR> \
        EKSClusterNameDev=<EKSClusterName_ANOTADO_DO_PASSO_3_EKS> \
        EKSClusterNameStaging=<EKSClusterName_ANOTADO_DO_PASSO_3_EKS> \
        EKSClusterNameProd=<EKSClusterName_ANOTADO_DO_PASSO_3_EKS> \
      --region <SUA_REGIAO_AWS>
    ```
    Anote o `CodePipelineName` e `ApprovalSNSTopicArn` da saída.

### Passo 5: Configurar GitOps com ArgoCD

1.  **Instalar ArgoCD no EKS:**
    Siga as instruções no arquivo `gitops/argocd-installation-guide.md` para instalar o ArgoCD no seu cluster EKS.

2.  **Configurar ArgoCD Application:**
    Crie um arquivo `argocd-application.yaml` (conforme exemplo em `gitops/argocd-installation-guide.md`) apontando para o seu repositório GitOps e aplique-o ao cluster EKS.

    ```bash
    kubectl apply -f argocd-application.yaml -n argocd
    ```

### Passo 6: Implantação do Monitoramento Avançado (CloudFormation)

Configure o grupo X-Ray para rastreamento distribuído.

```bash
aws cloudformation deploy \
  --template-file monitoring-xray/xray-group.yaml \
  --stack-name devops-advanced-xray \
  --capabilities CAPABILITY_NAMED_IAM \
  --parameter-overrides EnvironmentName=devops-advanced \
  --region <SUA_REGIAO_AWS>
```

### Passo 7: Implantação da Automação Orientada a Eventos (CloudFormation)

Configure a função Lambda e a regra EventBridge para acionar o pipeline.

```bash
aws cloudformation deploy \
  --template-file automation/event-driven-automation.yaml \
  --stack-name devops-advanced-automation \
  --capabilities CAPABILITY_NAMED_IAM \
  --parameter-overrides \
    EnvironmentName=devops-advanced \
    CodePipelineName=<CodePipelineName_ANOTADO_DO_PASSO_4_CODEPIPELINE> \
  --region <SUA_REGIAO_AWS>
```

## Testando a Aplicação e o Pipeline

1.  **Trigger Manual**: Faça um push para a branch `main` do seu repositório de código. Isso deve iniciar o CodePipeline.
2.  **Aprovações Manuais**: Monitore o CodePipeline no console da AWS. Você precisará aprovar manualmente as etapas de `ApprovalStaging` e `ApprovalProd`.
3.  **Verificar Implantação no EKS**: Após a aprovação e a atualização do repositório GitOps pelo CodeBuild, o ArgoCD deverá sincronizar as mudanças e implantar a nova versão do microserviço no EKS.
4.  **Acessar o Microserviço**: Obtenha o endpoint do LoadBalancer do serviço Kubernetes:
    ```bash
    kubectl get svc microservice-app-service
    ```
    Acesse o IP/Hostname externo no seu navegador.
5.  **Monitoramento X-Ray**: Envie algumas requisições para o microserviço e verifique o console do AWS X-Ray para ver os traces gerados.

## Otimização de Custos (CodeBuild Spot Instances)

O template `codebuild-spot.yaml` demonstra como configurar o CodeBuild para usar instâncias Spot. Isso pode reduzir significativamente os custos de build, embora possa haver pequenas interrupções se as instâncias Spot forem recuperadas. Para usar esta configuração, você precisaria substituir o `CodeBuildProjectECR` no `multi-env-codepipeline.yaml` pelo `CodeBuildProjectSpot`.

## Limpeza de Recursos

Para evitar cobranças desnecessárias, você pode remover todos os recursos criados na ordem inversa da implantação. Lembre-se de esvaziar buckets S3 e remover secrets do Secrets Manager manualmente, se necessário.

```bash
# Excluir stacks CloudFormation
aws cloudformation delete-stack --stack-name devops-advanced-automation --region <SUA_REGIAO_AWS>
aws cloudformation delete-stack --stack-name devops-advanced-xray --region <SUA_REGIAO_AWS>
aws cloudformation delete-stack --stack-name devops-advanced-multi-env-codepipeline --region <SUA_REGIAO_AWS>
aws cloudformation delete-stack --stack-name devops-advanced-codebuild-gitops-updater --region <SUA_REGIAO_AWS>
aws cloudformation delete-stack --stack-name devops-advanced-ecr --region <SUA_REGIAO_AWS>
aws cloudformation delete-stack --stack-name devops-advanced-eks-cluster --region <SUA_REGIAO_AWS>
aws cloudformation delete-stack --stack-name devops-advanced-eks-iam-roles --region <SUA_REGIAO_AWS>
aws cloudformation delete-stack --stack-name devops-advanced-eks-vpc --region <SUA_REGIAO_AWS>

# Excluir Secret do Secrets Manager
aws secretsmanager delete-secret --secret-id devops-advanced-github-token --region <SUA_REGIAO_AWS>

# Desinstalar ArgoCD do EKS (se instalado)
kubectl delete namespace argocd
```

---

**Autor**: Junior Moreira Martins  
**Disciplina**: Cloud diversity AWS  
**Curso**: Pós-graduação em Engenharia de Software  
**Última atualização**: Maio de 2026  