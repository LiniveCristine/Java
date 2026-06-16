# 🧠 Lógica de Programação Básica

A lógica de programação é a base para o desenvolvimento de software. Ela consiste em criar instruções organizadas para que o computador execute tarefas e resolva problemas.

---

# ➕ Operadores Aritméticos

Os operadores aritméticos são utilizados para realizar cálculos matemáticos.

| Operador | Função                    |
| -------- | ------------------------- |
| `+`      | Soma                      |
| `-`      | Subtração                 |
| `*`      | Multiplicação             |
| `/`      | Divisão                   |
| `%`      | Módulo (resto da divisão) |

---

## 📌 Exemplo

```java
int a = 10;
int b = 3;

System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3
System.out.println(a % b); // 1
```

---

## ⚠️ Precedência dos Operadores

Os operadores de multiplicação, divisão e módulo possuem prioridade sobre soma e subtração.

### Exemplo

```java
int resultado = 10 + 5 * 2;
```

O cálculo será:

```text
5 * 2 = 10
10 + 10 = 20
```

Resultado:

```java
20
```

---

# 📦 Variáveis

## O que são Variáveis?

Uma **variável** é uma porção da memória RAM utilizada para armazenar dados durante a execução de um programa.

Imagine uma variável como uma "caixa" onde podemos guardar informações temporariamente.

---

## 📝 Declaração de Variáveis

### Sintaxe

```java
[tipo] [nome] = [valor inicial];
```

### Exemplo

```java
int idade = 20;
```

Ao declarar uma variável:

1. Um espaço é reservado na memória RAM
2. É definido o tipo do dado
3. É atribuído um valor inicial (opcional)

---

## 🔍 Toda Variável Possui

### 🏷️ Nome (Identificador)

Utilizado para acessar a variável.

```java
idade
```

---

### 📋 Tipo

Define quais valores podem ser armazenados.

```java
int
```

---

### 📦 Valor

Conteúdo armazenado.

```java
20
```

---

### 📍 Endereço

Local da memória RAM onde o valor está armazenado.

> Esse endereço é gerenciado automaticamente pelo sistema.

---

# ☕ Tipos Primitivos do Java

Os tipos primitivos são os tipos básicos fornecidos pela linguagem.

---

## 🔢 Tipos Inteiros

| Tipo    | Tamanho |
| ------- | ------- |
| `byte`  | 8 bits  |
| `short` | 16 bits |
| `int`   | 32 bits |
| `long`  | 64 bits |

### Exemplo

```java
int idade = 25;
long populacao = 8000000000L;
```

---

## 🔣 Tipos Numéricos com Ponto Flutuante

Utilizados para armazenar números com casas decimais.

| Tipo     | Tamanho |
| -------- | ------- |
| `float`  | 32 bits |
| `double` | 64 bits |

### Exemplo

```java
float altura = 1.75f;
double salario = 2500.50;
```

---

## 🔤 Caractere Unicode

Armazena um único caractere.

| Tipo   | Tamanho |
| ------ | ------- |
| `char` | 16 bits |

### Exemplo

```java
char letra = 'A';
```

---

## ✅ Valor Verdade

Armazena verdadeiro ou falso.

| Tipo      | Tamanho                 |
| --------- | ----------------------- |
| `boolean` | 1 bit (conceitualmente) |

### Exemplo

```java
boolean ativo = true;
```

---

## 📝 String

Armazena uma sequência de caracteres (texto).

### Exemplo

```java
String nome = "Maria";
```

---
