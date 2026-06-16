# ☕ Introdução à Programação e Java

## 🧠 O que é um Algoritmo?

Um **algoritmo** é uma sequência finita de instruções utilizada para resolver um problema ou executar uma tarefa.

> Algoritmos não existem apenas na computação.

### 📌 Exemplo

Algoritmo para lavar roupa:

1. Separar as roupas
2. Colocar na máquina
3. Adicionar sabão
4. Selecionar o ciclo
5. Iniciar a lavagem

🎯 Objetivo: executar uma tarefa de forma organizada e previsível.

---

# 🤖 Automação

A **automação** consiste em utilizar máquinas para executar um algoritmo de forma automática ou semiautomática.

### 📌 Exemplo

* Algoritmo: processo de lavar roupa
* Automação: máquina de lavar executando esse processo

### 🎯 Benefícios

* Redução de esforço humano
* Maior velocidade
* Menor ocorrência de erros
* Padronização das tarefas

---

# 💻 Programas de Computador

Um **programa de computador** é um algoritmo escrito em uma linguagem que o computador consegue executar.

### 🛠 O que um programa pode fazer?

* Processar dados
* Realizar cálculos
* Automatizar tarefas
* Gerenciar informações
* Controlar dispositivos

---

# 🖥️ O que é um Computador?

O **computador** é uma máquina capaz de automatizar a execução de algoritmos.

### 🎯 Função principal

Executar programas que processam informações e realizam tarefas definidas pelo usuário.

---

# 📝 O que é uma Linguagem de Programação?

Uma **linguagem de programação** é um conjunto de regras utilizado para escrever programas.

Ela possui dois componentes principais:

## 🔤 Regras Léxicas

Relacionadas à ortografia da linguagem.

### Exemplos de erros léxicos

```java
publik class Exercicio1
```

❌ `publik` foi digitado incorretamente.

---

## 📖 Regras Sintáticas

Relacionadas à gramática da linguagem.

### Exemplos de erros sintáticos

```java
if (idade > 18
{
    System.out.println("Maior de idade");
}
```

❌ Falta o fechamento do parêntese.

---

# 🛠️ Ambiente Integrado de Desenvolvimento (IDE)

## O que é uma IDE?

**IDE (Integrated Development Environment)** é um conjunto de ferramentas utilizado para desenvolver programas.

### Exemplos

* IntelliJ IDEA
* Visual Studio
* Eclipse
* NetBeans
* VS Code

---

## 🎯 Principais Funções

### ✍️ Edição de código

* Escrever programas
* Destacar sintaxe
* Autocompletar código

### 🐞 Depuração (Debug)

* Identificar erros
* Executar passo a passo

### 🧪 Testes

* Validar o funcionamento do sistema

### 🔨 Build (Construção)

* Gerar versões executáveis da aplicação

### ⚙️ Outras tarefas

* Controle de versão (Git)
* Gerenciamento de dependências
* Refatoração de código

---

# ⚙️ Compilação, Interpretação e Máquina Virtual

## 📄 Código Fonte

É o código escrito pelo programador utilizando uma linguagem de programação.

### Exemplo

```java
System.out.println("Olá Mundo");
```

---

# 🔨 Compilação

Processo que transforma o código fonte em código executável.

## Etapas

### 1️⃣ Análise Léxica

Verifica a escrita do código.

### 2️⃣ Análise Sintática

Verifica a estrutura e gramática.

### 3️⃣ Geração de Código Objeto

Transforma o código fonte em código objeto.

### 4️⃣ Build

Transforma o código objeto em executável.

---

## Fluxo da Compilação

```text
Código Fonte
      ↓
Compilador
      ↓
Código Objeto
      ↓
Gerador de Código (Build)
      ↓
Executável
```

---

## 📌 Linguagens que utilizam esse modelo

* C
* C++

---

# 📝 Interpretação

Na interpretação, o código é executado diretamente pelo interpretador.

---

## Fluxo da Interpretação

```text
Código Fonte
      ↓
Interpretador
      ↓
Execução
```

---

## Características

### ✅ Vantagens

* Desenvolvimento mais rápido
* Não exige compilação completa

### ❌ Desvantagens

* Menor desempenho

---

## 📌 Linguagens interpretadas

* Python
* PHP
* Ruby

---

# ⚡ Abordagem Híbrida

Combina características da compilação e da interpretação.

---

## Fluxo

```text
Código Fonte
      ↓
Pré-compilação
      ↓
Bytecode
      ↓
Máquina Virtual
      ↓
Execução
```

---

## 📦 Bytecode

Código intermediário gerado após a pré-compilação.

Não é executável diretamente pelo sistema operacional.

---

## 🖥️ Máquina Virtual

Responsável por interpretar e executar o bytecode.

---

## 🎯 Principal Vantagem

O mesmo bytecode pode ser executado em diferentes sistemas operacionais.

Basta existir uma máquina virtual compatível.

---

## Comparação

### Linguagens Compiladas

```text
Windows → Executável Windows

Linux → Executável Linux
```

Cada sistema precisa de sua própria compilação.

---

### Linguagens com Máquina Virtual

```text
Código Fonte
      ↓
Bytecode
      ↓
JVM Windows
      ↓
Execução

Bytecode
      ↓
JVM Linux
      ↓
Execução
```

O mesmo bytecode funciona em diversos sistemas.

---

# ☕ Introdução ao Java

## O que é Java?

Java é uma linguagem de programação criada pela Sun Microsystems e atualmente mantida pela Oracle Corporation.

---

## Principais Características

✅ Orientada a Objetos

✅ Utiliza Máquina Virtual

✅ Portável

✅ Segura

✅ Amplamente utilizada em aplicações corporativas

---

## Modelo de Execução

Java utiliza o modelo híbrido.

```text
Código Fonte
      ↓
Compilador Java
      ↓
Bytecode (.class)
      ↓
JVM
      ↓
Execução
```

---

## 🚀 Compilação Just-In-Time (JIT)

A JVM utiliza o compilador **Just-In-Time (JIT)**.

### Função

Transformar partes do bytecode em código nativo durante a execução.

### Benefícios

* Melhor desempenho
* Mais rapidez que linguagens puramente interpretadas

---

# 📦 Edições do Java

## 📱 Java ME (Micro Edition)

Voltado para:

* Dispositivos embarcados
* Dispositivos móveis
* IoT

---

## 💻 Java SE (Standard Edition)

Voltado para:

* Aplicações desktop
* Aplicações servidoras
* Base para outras edições

---

## 🏢 Java EE (Enterprise Edition)

Voltado para:

* Grandes sistemas corporativos
* Aplicações empresariais
* Serviços web

> Atualmente conhecido como Jakarta EE.

---

# 🏗️ Estrutura de Aplicações Java

Java é uma linguagem orientada a objetos.

O código é organizado em níveis.

---

## 📄 Classe

Menor unidade de organização.

```java
public class Cliente {
}
```

---

## 📦 Pacote

Agrupamento lógico de classes relacionadas.

```text
com.empresa.clientes
```

---

## 📚 Módulo

Agrupamento lógico de pacotes.

```text
modulo-clientes
```

---

## 🏢 Aplicação

Agrupamento de módulos relacionados.

---

## Hierarquia

```text
Classe
   ↓
Pacote
   ↓
Módulo
   ↓
Aplicação
```

ou

```text
Classes
   <
Pacotes
   <
Módulos
   <
Aplicação
```

---

# 🔧 Instalação e Ferramentas

## ☕ JDK (Java Development Kit)

O **JDK** é o kit de desenvolvimento Java.

### Inclui

* JVM
* Compilador Java (`javac`)
* Ferramentas de desenvolvimento
* Bibliotecas padrão

---

## 🖥️ IntelliJ IDEA

Uma das IDEs mais utilizadas para desenvolvimento Java.

### Recursos

* Autocompletar código
* Refatoração
* Debug
* Testes
* Integração com Git
* Gerenciamento de projetos Maven e Gradle

---

# 📚 Resumo Final

## Conceitos Fundamentais

```text
Algoritmo
    ↓
Automação
    ↓
Programa
    ↓
Computador
```

---

## Formas de Execução

```text
Compilação
Código Fonte → Executável

Interpretação
Código Fonte → Execução

Modelo Híbrido
Código Fonte → Bytecode → JVM → Execução
```

---
