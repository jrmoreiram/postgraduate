# 📚 Repositório de Códigos — Pós-Graduação em Engenharia de Software

> Armazenamento centralizado de práticas, exercícios e projetos desenvolvidos durante o curso de **Pós-Graduação em Engenharia de Software**, com foco em desenvolvimento, arquitetura, dados e cloud computing.

---

## 📋 Índice
- [Visão Geral](#-visão-geral)
- [Objetivos](#-objetivos)
- [Estrutura do Repositório](#-estrutura-do-repositório)
- [Módulos e Disciplinas](#-módulos-e-disciplinas)
- [Tecnologias](#%EF%B8%8F-tecnologias)
- [Como Executar](#-como-executar)
- [Padrões e Boas Práticas](#-padrões-e-boas-práticas)
- [Versionamento](#-versionamento)
- [Segurança](#-segurança)
- [Licença](#-licença)

---

## 🎯 Visão Geral

Este repositório centraliza todos os códigos, exercícios, laboratórios e pequenos projetos desenvolvidos ao longo da **Pós-Graduação em Engenharia de Software**. Mantém histórico rastreável via Git, facilitando revisão, evolução e reutilização de conhecimento.

**Público:** ✅ Repositório público  
**Linguagens:** Java, SQL  
**Período:** Módulos 1, 2 e 3 + Conteúdo Bônus

---

## 🎓 Objetivos

✔️ Centralizar códigos produzidos em todas as disciplinas  
✔️ Documentar contexto, dependências e formas de execução  
✔️ Padronizar estrutura e nomenclatura para fácil navegação  
✔️ Garantir rastreabilidade via versionamento (Git)  
✔️ Facilitar revisão e reutilização de soluções  
✔️ Demonstrar evolução técnica ao longo do curso

---

## 📁 Estrutura do Repositório

```
.
├── modulo_1/
│   ├── logica_programacao_java/
│   │   ├── aula_01/
│   │   ├── aula_02/
│   │   ├── exercicios/
│   │   └── README.md
│   ├── interface_software/
│   │   ├── aula_01/
│   │   └── README.md
│   ├── gerenciamento_projetos/
│   │   └── README.md
│   └── metodologias_desenvolvimento/
│       └── README.md
│
├── modulo_2/
│   ├── programacao_extrema/
│   │   ├── aula_01/
│   │   └── README.md
│   ├── essencial_database/
│   │   ├── scripts_sql/
│   │   ├── exercicios/
│   │   └── README.md
│   ├── estrutura_dados/
│   │   ├── aula_01/
│   │   └── README.md
│   └── arquitetura_bi_bigdata/
│       ├── projetos/
│       └── README.md
│
├── modulo_3/
│   ├── plataformas_nuvem/
│   │   ├── aula_01/
│   │   └── README.md
│   ├── arquitetura_modelagem_dados/
│   │   ├── diagramas/
│   │   ├── scripts_sql/
│   │   └── README.md
│   ├── cloud_diversity_aws/
│   │   ├── projetos/
│   │   └── README.md
│   └── analise_dados_bi/
│       ├── dashboards/
│       └── README.md
│
├── bonus/
│   ├── hero_cloud_developer/
│   │   └── README.md
│   └── gestao_tempo/
│       └── README.md
│
├── docs/
│   ├── guias/
│   ├── arquitetura/
│   └── referencias.md
│
├── scripts/
│   ├── setup.sh
│   └── database_init.sql
│
├── .gitignore
├── LICENSE
└── README.md
```

---

## 🎓 Módulos e Disciplinas

### 📌 Módulo 1: Fundamentos e Metodologia

| Disciplina | Descrição | Linguagem |
|-----------|-----------|-----------|
| **Lógica de Programação com Java** | Conceitos fundamentais, estruturas de controle, POO | Java |
| **Interface de Software** | Design de interfaces, UX/UI, padrões | Java |
| **Gerenciamento Avançado de Projetos** | Planejamento, execução, monitoramento | Documentação |
| **Metodologias de Desenvolvimento** | Agile, Scrum, Kanban, boas práticas | Documentação |

### 📌 Módulo 2: Dados e Arquitetura

| Disciplina | Descrição | Linguagem |
|-----------|-----------|-----------|
| **Programação Extrema (XP)** | Pair programming, TDD, refatoração | Java |
| **Essencial Database** | SQL, modelagem relacional, otimização | SQL |
| **Estrutura de Dados para Sistemas Inteligentes** | Listas, árvores, grafos, algoritmos | Java |
| **Arquitetura de BI e Big Data** | Data warehousing, ETL, analytics | Java/SQL |

### 📌 Módulo 3: Cloud e Análise Avançada

| Disciplina | Descrição | Linguagem |
|-----------|-----------|-----------|
| **Plataformas para Desenvolvimento na Nuvem** | Cloud-native, microserviços, containers | Java |
| **Arquitetura e Modelagem de Dados** | Modelagem dimensional, star schema | SQL |
| **Cloud Diversity AWS** | EC2, S3, RDS, Lambda, CloudFormation | Java/SQL |
| **Análise de Dados e BI para Tomada de Decisão** | Dashboards, KPIs, storytelling com dados | SQL |

### 🎁 Conteúdo Bônus

| Disciplina | Descrição |
|-----------|-----------|
| **Hero Cloud Developer** | Certificação e práticas avançadas em cloud |
| **Gestão do Tempo** | Produtividade e organização pessoal |

---

## 🛠️ Tecnologias

### Linguagens
- **Java** (versão 11+)
  - Spring Framework / Spring Boot
  - JUnit 5 (testes)
  - Maven / Gradle (build)
  
- **SQL**
  - PostgreSQL / MySQL / Oracle
  - Stored Procedures, Triggers
  - Query optimization

### Ferramentas
- **Git** — Versionamento
- **Maven** — Gerenciamento de dependências (Java)
- **Docker** — Containerização (opcional)
- **AWS** — Cloud computing
- **IDE:** IntelliJ IDEA / Eclipse / VS Code

### Dependências Comuns (Java)
```xml
<!-- Spring Boot -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<!-- JUnit 5 -->
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <scope>test</scope>
</dependency>

<!-- JDBC / JPA -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```

---

## 🚀 Como Executar

### 📋 Pré-requisitos
- **Java Development Kit (JDK)** 11 ou superior
- **Maven** 3.6+
- **Git**
- **Banco de Dados** (PostgreSQL/MySQL conforme projeto)

### 🔧 Configuração Inicial

#### 1️⃣ Clonar o repositório
```bash
git clone https://github.com/seu-usuario/pos-graduacao-codigos.git
cd pos-graduacao-codigos
```

#### 2️⃣ Configurar variáveis de ambiente
Criar arquivo `.env` na raiz (não será versionado):
```bash
DB_HOST=localhost
DB_PORT=5432
DB_NAME=seu_banco
DB_USER=seu_usuario
DB_PASSWORD=sua_senha
JAVA_HOME=/caminho/para/jdk
```

#### 3️⃣ Instalar dependências (Maven)
```bash
mvn clean install
```

### ▶️ Executar Projetos Java

#### Projeto com Spring Boot
```bash
cd modulo_1/logica_programacao_java/aula_01
mvn spring-boot:run
```

#### Executar classe com main()
```bash
cd modulo_1/logica_programacao_java/exercicios
javac ExercicioXX.java
java ExercicioXX
```

#### Executar testes
```bash
mvn test
```

### 🗄️ Executar Scripts SQL

#### PostgreSQL
```bash
psql -U seu_usuario -d seu_banco -f scripts/database_init.sql
```

#### MySQL
```bash
mysql -u seu_usuario -p seu_banco < scripts/database_init.sql
```

#### Executar query específica
```sql
-- No cliente SQL (psql, mysql, etc.)
\i modulo_2/essencial_database/scripts_sql/aula_01_criacao_tabelas.sql
```

### 🐳 Executar com Docker (opcional)
```bash
docker-compose up -d
mvn clean install
mvn spring-boot:run
```

---

## 📐 Padrões e Boas Práticas

### 🎯 Nomenclatura

#### Arquivos Java
```
ExercicioXX.java          # Exercícios simples
AulaXX_Topico.java        # Exemplos de aula
ProjetoNome.java          # Projetos maiores
```

#### Arquivos SQL
```
aula_XX_descricao.sql     # Scripts de aula
ex_XX_descricao.sql       # Exercícios
init_database.sql         # Inicialização
```

#### Pastas
```
aula_01/                  # Conteúdo de aula
exercicios/               # Exercícios propostos
projetos/                 # Projetos maiores
scripts_sql/              # Scripts de banco de dados
```

### 💻 Padrões de Código Java

#### Estrutura de classe
```java
package com.posgraduacao.modulo1.logica;

import java.util.*;

/**
 * Descrição clara da classe.
 * 
 * @author Seu Nome
 * @version 1.0
 * @since 2024
 */
public class MinhaClasse {
    
    private String atributo;
    
    /**
     * Construtor padrão.
     */
    public MinhaClasse() {
        this.atributo = "";
    }
    
    /**
     * Método com documentação.
     * 
     * @param parametro descrição do parâmetro
     * @return descrição do retorno
     */
    public String metodo(String parametro) {
        // Implementação
        return parametro;
    }
}
```

#### Convenções
- **Classes:** `PascalCase` (ex.: `MinhaClasse`)
- **Métodos/Variáveis:** `camelCase` (ex.: `meuMetodo`, `minhaVariavel`)
- **Constantes:** `UPPER_SNAKE_CASE` (ex.: `VALOR_MAXIMO`)
- **Pacotes:** `com.posgraduacao.modulo.disciplina`

### 📝 Padrões SQL

#### Nomenclatura
```sql
-- Tabelas: snake_case, singular ou plural conforme contexto
CREATE TABLE usuario (
    id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    nome_usuario VARCHAR(100) NOT NULL,
    email_usuario VARCHAR(100) UNIQUE,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Índices
CREATE INDEX idx_usuario_email ON usuario(email_usuario);

-- Views
CREATE VIEW vw_usuarios_ativos AS
SELECT * FROM usuario WHERE ativo = 1;
```

#### Comentários
```sql
-- Comentário de linha única

/* 
   Comentário de múltiplas linhas
   Descreve a lógica complexa
*/
```

### ✅ Boas Práticas Gerais

✔️ **Código legível:** Nomes claros, indentação consistente  
✔️ **Comentários:** Explique o **porquê**, não o **quê**  
✔️ **DRY (Don't Repeat Yourself):** Evite duplicação  
✔️ **SOLID:** Aplique princípios de design  
✔️ **Testes:** Escreva testes unitários (JUnit)  
✔️ **Documentação:** Mantenha README em cada disciplina  

---

## 📌 Versionamento

### Convenção de Commits

Formato: `tipo: descrição`

```
feat:     Nova funcionalidade ou exercício
fix:      Correção de bug
docs:     Documentação
refactor: Refatoração de código
test:     Testes
chore:    Tarefas gerais (dependências, config)
style:    Formatação, sem mudança lógica
```

### Exemplos
```bash
git commit -m "feat: adiciona soluções da aula 03 de lógica de programação"
git commit -m "feat: implementa estrutura de dados - árvore binária"
git commit -m "fix: corrige validação de entrada no exercício 02"
git commit -m "docs: documenta execução do projeto de BI"
git commit -m "refactor: otimiza query de relatório mensal"
git commit -m "test: adiciona testes unitários para classe Usuario"
```

### Fluxo de Trabalho
```bash
# Criar branch para nova feature
git checkout -b feat/nova-disciplina

# Fazer commits
git add .
git commit -m "feat: adiciona conteúdo da disciplina X"

# Fazer push
git push origin feat/nova-disciplina

# Criar Pull Request (se aplicável)
```

---

## 🔒 Segurança

### ⚠️ Nunca versionar:
- Credenciais de banco de dados
- Chaves de API / Tokens
- Senhas ou secrets
- Arquivos `.env` com dados sensíveis

### ✅ Boas práticas:
1. Usar `.env` localmente (não versionado)
2. Usar variáveis de ambiente em produção
3. Usar `application.properties` com placeholders
4. Rotacionar credenciais se commitadas por engano

### Exemplo `.env` (não versionar)
```bash
# .env (adicionar ao .gitignore)
DB_HOST=localhost
DB_PORT=5432
DB_USER=admin
DB_PASSWORD=senha_super_secreta
AWS_ACCESS_KEY=AKIA...
AWS_SECRET_KEY=...
```

### Exemplo `application.properties` (versionado)
```properties
spring.datasource.url=jdbc:postgresql://${DB_HOST}:${DB_PORT}/${DB_NAME}
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}
```

---

## 📄 .gitignore

```gitignore
# IDE
.idea/
.vscode/
*.swp
*.swo
*~
.DS_Store

# Build
target/
build/
*.class
*.jar
*.war
*.ear

# Maven
.m2/
pom.xml.tag
pom.xml.releaseBackup

# Gradle
.gradle/
gradle/

# Environment
.env
.env.local
.env.*.local

# Database
*.db
*.sqlite
*.sql.bak

# Logs
logs/
*.log

# Temporary
tmp/
temp/
*.tmp

# OS
Thumbs.db
.DS_Store
```

---

## 📚 Estrutura de Documentação

Cada disciplina deve conter um `README.md` próprio:

# Disciplina: Lógica de Programação com Java

## 📖 Conteúdo
- Aula 01: Variáveis e tipos de dados
- Aula 02: Estruturas de controle
- ...

## 🎯 Objetivos
- Aprender conceitos fundamentais de Java
- Praticar lógica de programação

## 📁 Estrutura
- `aula_01/` — Exemplos da aula 01
- `exercicios/` — Exercícios propostos

## 🚀 Como executar
```bash
cd modulo_1/logica_programacao_java
javac aula_01/HelloWorld.java
java aula_01.HelloWorld
```

## 📚 Referências
- [Oracle Java Docs](https://docs.oracle.com/javase/)
- Livro: "Effective Java" - Joshua Bloch

---

## 📖 Referências e Recursos

### 📚 Documentação Oficial
- [Java SE Documentation](https://docs.oracle.com/javase/)
- [PostgreSQL Documentation](https://www.postgresql.org/docs/)
- [MySQL Documentation](https://dev.mysql.com/doc/)
- [AWS Documentation](https://docs.aws.amazon.com/)

### 📖 Livros Recomendados
- **Java:** "Effective Java" - Joshua Bloch
- **SQL:** "SQL Performance Explained" - Markus Winand
- **Arquitetura:** "Building Microservices" - Sam Newman
- **Cloud:** "AWS Well-Architected Framework"

### 🎓 Cursos e Tutoriais
- [Spring Boot Official Guide](https://spring.io/guides)
- [LeetCode](https://leetcode.com/) — Exercícios de algoritmos
- [HackerRank](https://www.hackerrank.com/) — Desafios de programação

---

## 📊 Status do Projeto

- ✅ Módulo 1: Em progresso
- ⏳ Módulo 2: Planejado
- ⏳ Módulo 3: Planejado
- ⏳ Bônus: Planejado

**Última atualização:** Abril de 2024

---

## 📄 Licença

Este repositório está licenciado sob a **MIT License** — veja o arquivo [LICENSE](LICENSE) para detalhes.

Você é livre para:
- ✅ Usar para fins educacionais
- ✅ Modificar e adaptar
- ✅ Compartilhar (com atribuição)

---

## 👤 Autor

**Nome:** Junior Moreira Martins  
**Curso:** Pós-Graduação em Engenharia de Software  
**Instituição:** Centro Universitário União das Américas Descomplica  
**Contato:** [jumoreiram@gmail.com](mailto:jumoreiram@gmail.com)  
**LinkedIn:** [jumoreiram](https://www.linkedin.com/in/jumoreiram/)

---

## 🤝 Contribuições

Este é um repositório pessoal de estudos. Sugestões e feedback são bem-vindos!

Para reportar problemas ou sugerir melhorias:
1. Abra uma **Issue**
2. Descreva o problema/sugestão
3. Aguarde feedback

---

## 📞 Suporte

Dúvidas sobre o conteúdo? Consulte:
- 📖 README de cada disciplina
- 📚 Documentação oficial das tecnologias
- 💬 Fóruns da comunidade (Stack Overflow, GitHub Discussions)

---

<div align="center">
  
**⭐ Se este repositório foi útil, considere dar uma estrela!**
  
**Desenvolvido com ❤️ durante a pós-graduação**

**Última atualização: Abril de 2024**

</div>
