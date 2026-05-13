# Disciplina de Lógica de Programação em Java

Este diretório contém uma coleção estruturada de lições práticas sobre **Programação Orientada a Objetos (POO)** e **Estruturas de Dados** em Java, desenvolvido como parte do módulo 1 do programa de pós-graduação.

## 📚 Estrutura das Lições

O projeto está organizado em 20 diretórios temáticos, cada um contendo exemplos práticos de conceitos específicos:

### **Fundamentos de POO**

| Lição | Descrição |
|-------|-----------|
| **classes-lesson** | Introdução a classes e objetos em Java |
| **methods-lesson** | Definição e uso de métodos em classes |
| **conditional-lesson** | Estruturas condicionais (if/else, switch) |
| **encapsulation-lesson** | Encapsulamento com getters/setters |

### **Herança e Polimorfismo**

| Lição | Descrição |
|-------|-----------|
| **inheritance-lesson** | Conceitos de herança e extensão de classes |
| **abstract-lesson** | Classes abstratas e métodos abstratos |
| **interfaces-lesson** | Implementação de interfaces |
| **method-overloading-lesson** | Sobrecarga de métodos (overloading) |
| **method-overriding-lesson** | Sobrescrita de métodos (overriding) |
| **polymorphisme-lesson** | Polimorfismo e comportamento dinâmico |

### **Estruturas de Dados**

| Lição | Descrição |
|-------|-----------|
| **arrays-lesson** | Trabalho com arrays primitivos |
| **matrices-lesson** | Matrizes bidimensionais |
| **vectors-lesson** | Classe Vector para coleções dinâmicas |
| **array-list-lesson** | ArrayList - lista dinâmica e flexível |
| **linked-list-lesson** | LinkedList - lista encadeada |
| **hash-set-lesson** | HashSet - conjunto sem duplicatas |
| **tree-set-lesson** | TreeSet - conjunto ordenado |

### **Tópicos Avançados**

| Lição | Descrição |
|-------|-----------|
| **string-lesson** | Manipulação e operações com Strings |
| **exceptions-lesson** | Tratamento de exceções |
| **iterator-lesson** | Padrão Iterator para coleções |
| **composition-lesson** | Composição de objetos |

## 🚀 Como Usar

### Pré-requisitos
- Java Development Kit (JDK) 8 ou superior
- Um editor de texto ou IDE (Eclipse, IntelliJ IDEA, VS Code)

### Compilar e Executar

Para compilar um arquivo específico:
```bash
javac diretorio/NomeDaClasse.java
```

Para executar:
```bash
java -cp . diretorio.NomeDaClasse
```

Exemplo prático:
```bash
# Compilar a lição de classes
javac classes-lesson/ClassesLesson.java

# Executar
java -cp . classes-lesson.ClassesLesson
```

## 📖 Sequência Recomendada

Recomenda-se estudar as lições na seguinte ordem para uma compreensão progressiva:

1. **classes-lesson** - Entenda a base de POO
2. **methods-lesson** - Aprenda a criar métodos
3. **conditional-lesson** - Controle de fluxo
4. **arrays-lesson** e **matrices-lesson** - Estruturas de dados básicas
5. **inheritance-lesson** - Reutilização de código
6. **abstract-lesson** - Abstração
7. **interfaces-lesson** - Contratos de implementação
8. **polymorphisme-lesson** - Polimorfismo
9. **encapsulation-lesson** - Boas práticas
10. **Estruturas de Dados** (Vector, ArrayList, LinkedList, HashSet, TreeSet)
11. **Tópicos avançados** - string, exceptions, iterator, composition

## 🎯 Conceitos-Chave Cobertos

- ✅ Classes e Objetos
- ✅ Herança e Hierarquias de Classes
- ✅ Polimorfismo e Métodos Virtuais
- ✅ Classes Abstratas
- ✅ Interfaces e Contratos
- ✅ Encapsulamento e Modificadores de Acesso
- ✅ Composição de Objetos
- ✅ Tratamento de Exceções
- ✅ Collections Framework (List, Set)
- ✅ Iteradores
- ✅ Sobrecarga e Sobrescrita de Métodos
- ✅ Matrizes e Vetores
- ✅ Manipulação de Strings

## 📝 Notas de Estudo

Cada arquivo de lição contém:
- **Comentários explicativos** sobre os conceitos abordados
- **Exemplos práticos** implementados em código
- **Saída esperada** que pode ser observada ao executar

Os arquivos compilados (`.class`) são gerados automaticamente após a compilação dos `.java`.

## 🔧 Estrutura de Arquivos

```
logica_programacao_java/
├── abstract-lesson/
│   ├── AbstractClassLesson.java
│   └── AbstractClassLesson.class
├── array-list-lesson/
├── classes-lesson/
├── ... (outros diretórios)
└── README.md
```

## 💡 Dicas Úteis

- Compile todos os arquivos de uma lição antes de executar
- Experimente modificar o código para aprofundar a compreensão
- Compare implementações diferentes (ex: ArrayList vs LinkedList)
- Execute as lições de estruturas de dados para entender performance e casos de uso

## 🎓 Objetivo do Módulo

Este módulo visa desenvolver uma base sólida em:
- Programação Orientada a Objetos em Java
- Estruturas de Dados e Algoritmos
- Boas práticas de design e arquitetura de software
- Preparação para desenvolvimento de aplicações mais complexas

---

**Última atualização:** Maio 2026  
**Linguagem:** Java 8+  
**Nível:** Intermediário
