# Hero Cloud Developer - LGPD Project

Um projeto fullstack completo desenvolvido com **Angular 15**, **Spring Boot 3.0** e **AWS**, focado em gerenciamento de dados com conformidade à Lei Geral de Proteção de Dados (LGPD).

## 📋 Visão Geral do Projeto

Este é um projeto educacional que demonstra uma arquitetura moderna de aplicação web com:

- **Frontend**: Angular 15 com Bootstrap 5 e componentes reativos
- **Backend**: Spring Boot 3.0 com Java 17
- **Database**: MySQL RDS na AWS (sa-east-1)
- **Containerização**: Docker e Nginx
- **Deployment**: Preparado para Cloud com PM2

## 🏗️ Arquitetura

```
hero_cloud_developer/
├── frontend (Angular 15)
│   ├── src/
│   ├── angular.json
│   ├── package.json
│   └── Dockerfile
├── back-end (Spring Boot)
│   ├── src/
│   │   ├── main/java/br/com/lgpd/
│   │   │   ├── controller/UserController.java
│   │   │   ├── service/UserService.java
│   │   │   ├── entity/User.java
│   │   │   ├── repository/UserRepository.java
│   │   │   └── LgpdApplication.java
│   │   └── resources/application.properties
│   ├── pom.xml
│   └── pm2.json
├── nginx.conf
└── Dockerfile
```

## 🛠️ Stack Tecnológico

### Frontend
- **Angular**: 15.0.5
- **Bootstrap**: 5.2.3
- **ng-bootstrap**: 14.0.0
- **ngx-formly**: 6.0.4 (Formulários dinâmicos)
- **FontAwesome**: 6.2.0 (Ícones)
- **Axios**: 1.2.2 (HTTP client)
- **RxJS**: 7.5.0 (Programação reativa)

### Backend
- **Spring Boot**: 3.0.1
- **Java**: 17
- **Spring Data JPA**: ORM para banco de dados
- **Spring Web**: REST APIs
- **Spring Actuator**: Health checks e métricas
- **MySQL Connector**: 8.0.x
- **Lombok**: Redução de boilerplate
- **Maven**: Gerenciador de dependências

### Infraestrutura
- **Docker**: Containerização com Nginx 1.17.1
- **AWS RDS**: MySQL gerenciado (sa-east-1)
- **PM2**: Gerenciador de processos Node.js
- **Nginx**: Reverse proxy e servidor web estático

## 🚀 Como Começar

### Pré-requisitos
- Node.js 16+
- Java 17+
- Maven 3.8+
- Docker (opcional)
- MySQL (ou usar AWS RDS)

### Instalação do Frontend

```bash
cd /home/jmmartins/workspace/postgraduate/bonus/hero_cloud_developer
npm install
```

### Executar em Desenvolvimento

```bash
# Frontend (Angular Dev Server)
npm start
# Acesse: http://localhost:4200/

# Backend (Spring Boot)
cd back-end
mvn spring-boot:run
# Acesso API: http://localhost:8090
```

## 📦 Comandos Disponíveis

### Frontend

| Comando | Descrição |
|---------|-----------|
| `npm start` | Inicia servidor de desenvolvimento Angular |
| `npm run build` | Build para produção |
| `npm run docker` | Constrói imagem Docker |
| `npm run build:docker` | Build e Docker em uma comando |
| `npm run watch` | Build em modo watch |
| `npm test` | Executa testes unitários (Karma + Jasmine) |

### Backend

```bash
cd back-end

# Compilar e rodar
mvn spring-boot:run

# Apenas compilar
mvn clean compile

# Gerar JAR
mvn clean package

# Rodar testes
mvn test

# Build com Maven Wrapper (cross-platform)
./mvnw clean package
```

## 🐳 Docker

### Build e executar com Docker

```bash
# Frontend
npm run build:docker

# Ou manualmente
npm run build
docker build -t lgpd-front .
docker run -p 80:80 lgpd-front
```

### Docker Compose (se disponível)

O projeto está configurado para rodar em containers com:
- Frontend em Nginx (porta 80)
- Backend em Spring Boot (porta 8090)
- MySQL RDS (AWS)

## 🗄️ Configuração do Banco de Dados

O arquivo `back-end/src/main/resources/application.properties` contém:

```properties
spring.datasource.url=jdbc:mysql://database-1.c5ykb82l0oxa.sa-east-1.rds.amazonaws.com:3306/lgpd
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
server.port=8090
```

**Nota**: As credenciais de banco de dados estão expostas neste arquivo. Em produção, usar variáveis de ambiente.

## 📊 API Endpoints

O backend expõe endpoints REST através de `UserController`:

```
GET    /api/users      - Listar usuários
POST   /api/users      - Criar usuário
GET    /api/users/{id} - Obter usuário por ID
PUT    /api/users/{id} - Atualizar usuário
DELETE /api/users/{id} - Deletar usuário
```

## 🧪 Testes

### Frontend (Angular)
```bash
npm test
```
Executa testes com Karma e Jasmine

### Backend (Spring Boot)
```bash
cd back-end
mvn test
```
Executa testes da classe `LgpdApplicationTests.java`

## 🔍 Estrutura do Código

### Backend - Padrão MVC

- **Entity**: Modelo de dados (`User.java`)
- **Repository**: Acesso aos dados (`UserRepository.java`) - Spring Data JPA
- **Service**: Lógica de negócio (`UserService.java`, `UserServiceImpl.java`)
- **Controller**: Endpoints REST (`UserController.java`)

### Frontend - Componentes Angular

Estrutura típica de um projeto Angular:
- `src/app/components/` - Componentes reutilizáveis
- `src/app/services/` - Serviços HTTP e lógica compartilhada
- `src/app/models/` - Interfaces e classes TypeScript
- `src/assets/` - Recursos estáticos

## 🌐 AWS Integration

Projeto configurado para uso com AWS:
- **RDS MySQL**: Banco de dados gerenciado
- **Região**: sa-east-1 (São Paulo)
- **Potencial para EC2/ECS**: Deploy de containers

## 📝 Configuração de Produção

### PM2 (Node.js Process Manager)
Arquivo `back-end/pm2.json` configurado para gerenciar processos

### Nginx Reverse Proxy
`nginx.conf` configurado para:
- Servir arquivos estáticos do Angular
- Redirect para backend quando necessário
- SPA routing com try_files

## ✅ Próximos Passos

1. Configurar variáveis de ambiente para credenciais
2. Implementar autenticação/autorização
3. Adicionar validações de LGPD
4. Implementar testes E2E
5. Setup de CI/CD (GitHub Actions, Jenkins, etc)
6. Documentação de API (Swagger/OpenAPI)

## 📚 Referências

- [Angular CLI Documentation](https://angular.io/cli)
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [AWS RDS MySQL](https://docs.aws.amazon.com/rds/latest/userguide/USER_ConnectToInstance.html)
- [Docker Documentation](https://docs.docker.com/)

## 📄 Licença

Projeto desenvolvido para fins educacionais no programa postgraduate.
