# Aula - Estrutura de Dados para Sistemas Inteligentes

Um repositório educacional contendo exemplos práticos de estruturas de dados e algoritmos em Java. Este material é ideal para alunos e profissionais que desejam aprender e consolidar conhecimentos sobre programação com foco em inteligência de sistemas.

## 📚 Conteúdo do Repositório

O repositório está organizado em 8 módulos principais, cada um focado em um tópico fundamental de estruturas de dados:

### 1. **Collections Lesson** (`collections-lesson/`)
Demonstra o uso de Collections Framework do Java, incluindo:
- **ArrayList** - Listas dinâmicas
- **LinkedList** - Listas encadeadas
- **HashMap** - Mapas de chave-valor
- **LinkedHashMap** - Mapas ordenados por inserção
- **HashSet** - Conjuntos únicos não ordenados
- **LinkedHashSet** - Conjuntos ordenados
- **TreeMap** - Mapas ordenados naturalmente
- **TreeSet** - Conjuntos ordenados
- **Cricketer Custom Comparators** - Uso de comparadores customizados
- **Copy and Count Operations** - Operações de cópia e contagem

**Arquivos principais:**
- `ArrayListDemo.java`
- `LinkedListDemo.java`
- `HashMapDemo.java`, `LinkedHashMapDemo.java`, `TreeMapDemo.java`
- `HashSetDemo.java`, `LinkedHashSetDemo.java`, `CricketerTreeSetDemo.java`
- `CopyListDemo.java`, `CountWordsDemo.java`

### 2. **Data Structures Lesson** (`data-structures-lesson/`)
Cobre estruturas fundamentais e algoritmos:
- **Árvores Binárias** - Implementação e operações
- **Árvores de Busca Binária (BST)** - Inserção, busca e traversal
- **Árvores Aritméticas** - Expressões em forma de árvore
- **Algoritmos de Ordenação** - Bubble Sort
- **Operações com Matrizes e Vetores**

**Arquivos principais:**
- `BinaryTree*.java` - Várias implementações de árvores binárias
- `BinarySearchTree*.java` - BST com diferentes abordagens
- `ArithmeticBinaryTree.java` - Árvores para expressões aritméticas
- `BubbleSort.java` - Algoritmo clássico de ordenação
- `SumMatrix.java`, `SumFirstHundred.java`, `VectorSum.java`

### 3. **Linked List Lesson** (`linked-list-lesson/`)
Foco em listas encadeadas avançadas:
- **LinkedListOperations** - Operações fundamentais
- **ApplicationsWithLinkedList** - Casos de uso práticos

**Arquivos principais:**
- `LinkedListOperations.java`
- `ApplicationsWithLinkedList.java`

### 4. **Loops Lesson** (`loops-lesson/`)
Controle de fluxo com diferentes tipos de loops:
- **For Loop** - Loops com contador
- **While Loop** - Loops condicionais
- **Do-While Loop** - Loops com execução garantida
- **Enhanced For Loop** - For-each em coleções
- **Break e Continue** - Controle de fluxo
- **Labeled Statements** - Break/continue rotulados

**Arquivos principais:**
- `ForLoopDivisibleBySeven.java`
- `WhileLoopDemo.java`, `WhileLoopNegativeConditional.java`
- `DoWhileLoopDemo.java`
- `EnhancedForLoopDemo.java`
- `BreakContinueDemo.java`, `LabeledBreakContinueDemo.java`
- `ReturnDemo.java`

### 5. **Queues Lesson** (`queues-lesson/`)
Estrutura de dados de fila (FIFO):
- **Queue Implementation** - Implementação básica
- **Queue Applications** - Aplicações práticas

**Arquivos principais:**
- `QueueingApplicationsInJava.java`
- `EvenNumbers.java`

### 6. **Recursion Lesson** (`recursion-lesson/`)
Conceitos e implementações recursivas:
- **Factorial** - Cálculo recursivo de fatorial
- **Power** - Cálculo recursivo de potência
- **Variações** - Diferentes abordagens recursivas

**Arquivos principais:**
- `Factorial.java`, `FactorialP.java`
- `Power.java`

### 7. **Stacks Lesson** (`stacks-lesson/`)
Estrutura de dados de pilha (LIFO):
- **Stack Applications** - Aplicações práticas de pilhas

**Arquivos principais:**
- `ApplyingStacksInJava.java`

### 8. **Strings Lesson** (`strings-lesson/`)
Manipulação e comparação de strings em Java:
- **String Comparison** - Diferentes métodos de comparação
- **Performance** - Análise de performance em strings
- **String Methods** - Métodos úteis da classe String

**Arquivos principais:**
- `StringCompareDemo.java`
- `StringComparePerformance.java`
- `StringDeepCompareDemo.java`
- `StringMethodsDemo.java`

## 🎯 Objetivos de Aprendizado

Este material permite você:
- ✅ Entender as principais estruturas de dados em Java
- ✅ Aprender casos de uso prático para cada estrutura
- ✅ Comparar performance entre diferentes implementações
- ✅ Implementar algoritmos eficientes
- ✅ Trabalhar com Collections Framework do Java
- ✅ Dominar conceitos como recursão, loops e operações de lista

## 🚀 Como Usar

### Compilação
```bash
javac nome_do_arquivo.java
```

### Execução
```bash
java NomeDaClasse
```

### Exemplo Prático
```bash
cd collections-lesson
javac ArrayListDemo.java
java ArrayListDemo
```

## 💻 Requisitos
- **Java JDK 8+** (preferencialmente Java 11 ou superior)
- Um editor de texto ou IDE Java (Eclipse, IntelliJ IDEA, NetBeans, VS Code)

## 📋 Estrutura de Arquivos

```
exercicios/
├── collections-lesson/
│   ├── ArrayListDemo.java
│   ├── LinkedListDemo.java
│   ├── HashMap*.java
│   ├── HashSet*.java
│   ├── TreeMap*.java
│   ├── TreeSet*.java
│   └── ...
├── data-structures-lesson/
│   ├── BinaryTree*.java
│   ├── BinarySearchTree*.java
│   ├── BubbleSort.java
│   └── ...
├── linked-list-lesson/
├── loops-lesson/
├── queues-lesson/
├── recursion-lesson/
├── stacks-lesson/
└── strings-lesson/
```

## 🔍 Tópicos Abordados

| Tópico | Arquivos | Complexidade |
|--------|----------|--------------|
| ArrayList/LinkedList | `collections-lesson/` | ⭐⭐ |
| HashMap/TreeMap | `collections-lesson/` | ⭐⭐⭐ |
| Árvores Binárias | `data-structures-lesson/` | ⭐⭐⭐ |
| Recursão | `recursion-lesson/` | ⭐⭐⭐ |
| Filas e Pilhas | `queues-lesson/`, `stacks-lesson/` | ⭐⭐ |
| Strings | `strings-lesson/` | ⭐ |

## 📖 Recomendação de Ordem de Estudo

1. **Loops Lesson** - Fundações de controle de fluxo
2. **Strings Lesson** - Manipulação básica de dados
3. **Recursion Lesson** - Conceitos avançados
4. **Data Structures Lesson** - Estruturas fundamentais
5. **Collections Lesson** - Collections Framework
6. **Linked List Lesson** - Listas avançadas
7. **Queues Lesson** e **Stacks Lesson** - Estruturas especializadas

## 💡 Dicas de Aprendizado

- **Compile e execute** cada programa para ver o resultado
- **Modifique o código** para experimentar e aprender
- **Estude os comentários** dentro dos arquivos
- **Compare diferentes implementações** de mesma funcionalidade
- **Analise a performance** entre diferentes abordagens

## 🔗 Recursos Adicionais

Para aprofundar seus conhecimentos:
- [Java Collections Framework Documentation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/package-summary.html)
- [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/)
- [Data Structures and Algorithms Course](https://www.coursera.org/learn/data-structures)

## 📝 Notas

- Todos os arquivos estão compilados (`.class` files presentes)
- Os exemplos usam generics modernos (`<T>`) para type safety
- Recomenda-se usar Java 8+ para compatibilidade total

## 🏆 Contribuindo

Se você melhorar algum exemplo ou tiver sugestões, considere criar documentação adicional ou comentários mais descritivos no código.

---

**Última atualização:** Maio de 2026  
**Nível:** Iniciante a Intermediário  
**Linguagem:** Java
