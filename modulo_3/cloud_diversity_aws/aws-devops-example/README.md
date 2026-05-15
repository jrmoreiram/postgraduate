# Exemplo de Pipeline DevOps na AWS

Este projeto demonstra a implementação de um pipeline de CI/CD completo na AWS utilizando as seguintes ferramentas:

- **AWS CodePipeline**: Orquestração do pipeline de CI/CD.
- **AWS CodeBuild**: Compilação de código, execução de testes e geração de artefatos.
- **AWS CodeDeploy**: Implantação contínua da aplicação em instâncias EC2.
- **AWS CloudFormation**: Gerenciamento de infraestrutura como código (IaC).
- **AWS CloudWatch**: Monitoramento de métricas e alarmes para o pipeline e a aplicação.

## Estrutura do Projeto

```
aws-devops-example/
├── app/
│   ├── index.js
│   ├── package.json
│   ├── buildspec.yml
│   ├── appspec.yml
│   └── scripts/
│       ├── install_dependencies.sh
│       ├── start_application.sh
│       └── stop_application.sh
├── infrastructure/
│   ├── vpc.yaml
│   ├── iam-roles.yaml
│   ├── ec2.yaml
│   └── s3-artifacts.yaml
├── pipeline/
│   ├── codebuild.yaml
│   ├── codedeploy.yaml
│   └── codepipeline.yaml
└── monitoring/
    └── cloudwatch.yaml
└── README.md
```

- `app/`: Contém o código-fonte da aplicação Node.js de exemplo, testes, `buildspec.yml` para o CodeBuild, `appspec.yml` e scripts de ciclo de vida para o CodeDeploy.
- `infrastructure/`: Contém os templates CloudFormation para provisionar a infraestrutura base (VPC, IAM Roles, EC2, S3 para artefatos).
- `pipeline/`: Contém os templates CloudFormation para configurar o CodeBuild, CodeDeploy e CodePipeline.
- `monitoring/`: Contém o template CloudFormation para configurar alarmes e dashboards do CloudWatch.

## Pré-requisitos

Antes de iniciar, certifique-se de ter:

1.  Uma conta AWS ativa.
2.  AWS CLI configurada com credenciais de acesso programático.
3.  Um repositório GitHub (ou AWS CodeCommit) com o conteúdo deste projeto.
4.  Um Personal Access Token do GitHub com permissões de `repo` para o CodePipeline acessar seu repositório. **Importante**: Em um ambiente de produção, considere usar o AWS Secrets Manager para armazenar este token de forma segura.

## Guia de Implantação

Siga os passos abaixo para implantar o pipeline e a aplicação na sua conta AWS.

### Passo 1: Clonar o Repositório e Fazer Upload para o GitHub

Clone este repositório para sua máquina local e faça o upload de todo o conteúdo para um novo repositório no GitHub (ou AWS CodeCommit).

```bash
git clone <URL_DESTE_REPOSITORIO>
cd aws-devops-example
# Crie um novo repositório no GitHub e faça o push do código
```

### Passo 2: Implantação da Infraestrutura Base (CloudFormation)

Primeiro, vamos criar os recursos de infraestrutura essenciais.

1.  **Criar S3 Bucket para Artefatos:**
    Este bucket será usado pelo CodePipeline para armazenar artefatos. O nome do bucket deve ser globalmente único.

    ```bash
    aws cloudformation deploy \
      --template-file infrastructure/s3-artifacts.yaml \
      --stack-name devops-example-s3-artifacts \
      --capabilities CAPABILITY_NAMED_IAM \
      --parameter-overrides EnvironmentName=devops-example \
      --region <SUA_REGIAO_AWS>
    ```
    Anote o `CodePipelineArtifactsBucketName` da saída, você precisará dele mais tarde.

2.  **Criar VPC:**

    ```bash
    aws cloudformation deploy \
      --template-file infrastructure/vpc.yaml \
      --stack-name devops-example-vpc \
      --capabilities CAPABILITY_NAMED_IAM \
      --parameter-overrides EnvironmentName=devops-example \
      --region <SUA_REGIAO_AWS>
    ```
    Anote os `VPCId`, `PublicSubnetId` e `RouteTableId` da saída.

3.  **Criar IAM Roles:**
    Essas roles são necessárias para o EC2, CodeDeploy e CodePipeline.

    ```bash
    aws cloudformation deploy \
      --template-file infrastructure/iam-roles.yaml \
      --stack-name devops-example-iam-roles \
      --capabilities CAPABILITY_NAMED_IAM \
      --parameter-overrides EnvironmentName=devops-example \
      --region <SUA_REGIAO_AWS>
    ```
    Anote os `EC2InstanceProfileArn`, `CodeDeployServiceRoleArn` e `CodePipelineServiceRoleArn` da saída.

4.  **Criar Instância EC2:**
    Esta será a instância onde a aplicação será implantada. O agente do CodeDeploy será instalado via `UserData`.

    ```bash
    aws cloudformation deploy \
      --template-file infrastructure/ec2.yaml \
      --stack-name devops-example-ec2 \
      --capabilities CAPABILITY_NAMED_IAM \
      --parameter-overrides \
        EnvironmentName=devops-example \
        VPCId=<VPCId_ANOTADO> \
        PublicSubnetId=<PublicSubnetId_ANOTADO> \
        EC2InstanceProfileArn=<EC2InstanceProfileArn_ANOTADO> \
      --region <SUA_REGIAO_AWS>
    ```
    Anote o `WebServerInstanceId` da saída.

### Passo 3: Implantação dos Serviços de Pipeline (CloudFormation)

Agora, vamos configurar o CodeBuild, CodeDeploy e CodePipeline.

1.  **Criar Projeto CodeBuild:**

    ```bash
    aws cloudformation deploy \
      --template-file pipeline/codebuild.yaml \
      --stack-name devops-example-codebuild \
      --capabilities CAPABILITY_NAMED_IAM \
      --parameter-overrides \
        EnvironmentName=devops-example \
        CodePipelineArtifactsBucketName=<CodePipelineArtifactsBucketName_ANOTADO> \
      --region <SUA_REGIAO_AWS>
    ```
    Anote o `CodeBuildProjectName` da saída.

2.  **Criar Aplicação e Grupo de Implantação CodeDeploy:**

    ```bash
    aws cloudformation deploy \
      --template-file pipeline/codedeploy.yaml \
      --stack-name devops-example-codedeploy \
      --capabilities CAPABILITY_NAMED_IAM \
      --parameter-overrides \
        EnvironmentName=devops-example \
        CodeDeployServiceRoleArn=<CodeDeployServiceRoleArn_ANOTADO> \
        WebServerInstanceId=<WebServerInstanceId_ANOTADO> \
      --region <SUA_REGIAO_AWS>
    ```
    Anote o `CodeDeployApplicationName` e `CodeDeployDeploymentGroupName` da saída.

3.  **Criar CodePipeline:**
    Este é o pipeline principal que orquestra todo o processo.

    ```bash
    aws cloudformation deploy \
      --template-file pipeline/codepipeline.yaml \
      --stack-name devops-example-codepipeline \
      --capabilities CAPABILITY_NAMED_IAM \
      --parameter-overrides \
        EnvironmentName=devops-example \
        CodePipelineServiceRoleArn=<CodePipelineServiceRoleArn_ANOTADO> \
        CodePipelineArtifactsBucketName=<CodePipelineArtifactsBucketName_ANOTADO> \
        GitHubOwner=<SEU_USUARIO_GITHUB> \
        GitHubRepo=<NOME_DO_SEU_REPOSITORIO> \
        GitHubBranch=main \
        GitHubToken=<SEU_GITHUB_PERSONAL_ACCESS_TOKEN> \
        CodeBuildProjectName=<CodeBuildProjectName_ANOTADO> \
        CodeDeployApplicationName=<CodeDeployApplicationName_ANOTADO> \
        CodeDeployDeploymentGroupName=<CodeDeployDeploymentGroupName_ANOTADO> \
      --region <SUA_REGIAO_AWS>
    ```
    Anote o `CodePipelineName` da saída.

### Passo 4: Implantação do Monitoramento (CloudFormation)

Por fim, configure os alarmes e o dashboard do CloudWatch.

```bash
aws cloudformation deploy \
  --template-file monitoring/cloudwatch.yaml \
  --stack-name devops-example-cloudwatch \
  --capabilities CAPABILITY_NAMED_IAM \
  --parameter-overrides \
    EnvironmentName=devops-example \
    WebServerInstanceId=<WebServerInstanceId_ANOTADO> \
    CodePipelineName=<CodePipelineName_ANOTADO> \
  --region <SUA_REGIAO_AWS>
```

## Testando a Aplicação

Após a implantação bem-sucedida do pipeline, o CodeDeploy implantará a aplicação na instância EC2. Você pode obter o IP público da instância EC2 na saída da stack `devops-example-ec2` (Output: `WebServerPublicIp`).

Abra um navegador e acesse `http://<WebServerPublicIp>`. Você deverá ver uma resposta JSON da aplicação Node.js.

## Gatilho do Pipeline

Qualquer push para a branch `main` do seu repositório GitHub (ou a branch configurada) irá automaticamente disparar o CodePipeline, que passará pelas etapas de Build e Deploy.

## Limpeza de Recursos

Para evitar cobranças desnecessárias, você pode remover todos os recursos criados na ordem inversa da implantação:

```bash
aws cloudformation delete-stack --stack-name devops-example-cloudwatch --region <SUA_REGIAO_AWS>
aws cloudformation delete-stack --stack-name devops-example-codepipeline --region <SUA_REGIAO_AWS>
aws cloudformation delete-stack --stack-name devops-example-codedeploy --region <SUA_REGIAO_AWS>
aws cloudformation delete-stack --stack-name devops-example-codebuild --region <SUA_REGIAO_AWS>
aws cloudformation delete-stack --stack-name devops-example-ec2 --region <SUA_REGIAO_AWS>
aws cloudformation delete-stack --stack-name devops-example-iam-roles --region <SUA_REGIAO_AWS>
aws cloudformation delete-stack --stack-name devops-example-vpc --region <SUA_REGIAO_AWS>
aws cloudformation delete-stack --stack-name devops-example-s3-artifacts --region <SUA_REGIAO_AWS>
```

**Nota**: Pode ser necessário esvaziar o bucket S3 de artefatos manualmente antes de excluí-lo, pois o CloudFormation não exclui buckets não vazios por padrão.

## Considerações de Produção

-   **Segurança**: Restrinja as permissões IAM o máximo possível (princípio do menor privilégio). Use o AWS Secrets Manager para credenciais sensíveis.
-   **Alta Disponibilidade**: Para aplicações em produção, use um Application Load Balancer (ALB) e um Auto Scaling Group com múltiplas instâncias EC2 em diferentes Zonas de Disponibilidade.
-   **Estratégias de Implantação**: Explore estratégias de implantação mais avançadas do CodeDeploy, como Blue/Green, para zero downtime e rollback fácil.
-   **Testes**: Adicione mais testes automatizados (unitários, de integração, de ponta a ponta) no estágio de Build.
-   **Monitoramento Avançado**: Configure logs centralizados (CloudWatch Logs, Kinesis Firehose para S3/Elasticsearch), rastreamento distribuído (AWS X-Ray) e mais métricas personalizadas.
-   **Notificações**: Integre o CodePipeline com o SNS para receber notificações sobre o status do pipeline.

---

**Autor**: Junior Moreira Martins  
**Disciplina**: Cloud diversity AWS  
**Curso**: Pós-graduação em Engenharia de Software  
**Última atualização**: Maio de 2026  