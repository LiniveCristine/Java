# 🔄 As 3 Operações Básicas da Programação

Todo programa realiza três operações fundamentais:

```text
Entrada → Processamento → Saída
```

---

# ⌨️ Entrada de Dados

É o momento em que o usuário fornece informações ao programa.

Os dados recebidos são armazenados em variáveis.

---

## Exemplos de Dispositivos de Entrada

* Teclado
* Mouse
* Scanner
* Microfone

### Fluxo

```text
Usuário
   ↓
Entrada
   ↓
Variáveis
```

---

# ⚙️ Processamento de Dados

É a etapa em que o programa executa cálculos ou manipula informações.

O processamento ocorre principalmente através de:

* Operações matemáticas
* Comparações
* Atribuições de valores

---

## Exemplo

```java
double salario = 2500.00;
double bonus = salario * 0.10;
```

O cálculo do bônus faz parte do processamento.

---

# 🖥️ Saída de Dados

É o momento em que o programa apresenta informações ao usuário.

---

## Exemplos de Dispositivos de Saída

* Monitor
* Impressora
* Alto-falante

### Fluxo

```text
Variáveis
   ↓
Saída
   ↓
Usuário
```

---

# 📢 Saída de Dados em Java

## System.out.print()

Exibe informações sem quebrar a linha.

### Exemplo

```java
System.out.print("Olá ");
System.out.print("Mundo");
```

### Saída

```text
Olá Mundo
```

---

## System.out.println()

Exibe informações e pula para a próxima linha.

### Exemplo

```java
System.out.println("Olá");
System.out.println("Mundo");
```

### Saída

```text
Olá
Mundo
```

---

# 🔢 Trabalhando com Números Decimais

## Declarando um Double

```java
double y = 10.3435;
```

---

# 🎯 Controlando Casas Decimais

Utilizamos `printf()` para formatar a saída.

### Exemplo

```java
System.out.printf("%.2f%n", y);
```

### Saída

```text
10.34
```

---

## Significado dos Símbolos

| Símbolo | Função               |
| ------- | -------------------- |
| `%`     | Início da formatação |
| `.2`    | Duas casas decimais  |
| `f`     | Número decimal       |
| `%n`    | Quebra de linha      |

---

# 🌎 Configurando o Locale

Em alguns países, números decimais utilizam vírgula.

Para utilizar ponto (`.`), configure o Locale para os Estados Unidos.

### Importação

```java
import java.util.Locale;
```

### Configuração

```java
Locale.setDefault(Locale.US);
```

---

## Exemplo

```java
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double valor = 10.5;

        System.out.printf("%.2f%n", valor);
    }
}
```

### Saída

```text
10.50
```

---

# 🔗 Concatenação

Concatenação é a união de textos e valores.

Utilizamos o operador `+`.

---

## Exemplo

```java
double y = 10.5;

System.out.println("RESULTADO = " + y + " metros");
```

### Saída

```text
RESULTADO = 10.5 metros
```

---

# 🎯 Utilizando Placeholders

Os placeholders permitem inserir valores dentro de uma string formatada usando `printf()`.

---

## Exemplo

```java
double x = 10.5;

System.out.printf("Resultado = %.2f metros%n", x);
```

### Saída

```text
Resultado = 10.50 metros
```

---

# 📌 Principais Placeholders

| Placeholder | Tipo                |
| ----------- | ------------------- |
| `%f`        | `float` ou `double` |
| `%d`        | `int`               |
| `%s`        | `String`            |
| `%n`        | Quebra de linha     |

---

## Exemplo Completo

```java
String nome = "João";
int idade = 20;
double altura = 1.75;

System.out.printf(
    "Nome: %s%nIdade: %d%nAltura: %.2f%n",
    nome,
    idade,
    altura
);
```

### Saída

```text
Nome: João
Idade: 20
Altura: 1.75
```

---

# 🔄 Casting e Entrada de Dados em Java

Nesta etapa, aprenderemos dois conceitos fundamentais da programação em Java:

* **Casting (Conversão de Tipos)**
* **Entrada de Dados com Scanner**

---

# 🔄 Casting

## O que é Casting?

**Casting** é o processo de conversão de um tipo de dado para outro.

Pode ser utilizado com:

* Tipos primitivos (`int`, `double`, `char`, etc.)
* Objetos (assunto estudado mais adiante)

---

## 📝 Sintaxe

Basta informar o tipo desejado entre parênteses:

```java
(int)
(double)
(char)
```

### Exemplo

```java
double valor = 10.5;

int numero = (int) valor;
```

---

# ➗ Divisão de Inteiros

Um detalhe importante em Java é que:

> A divisão entre dois números inteiros sempre gera um resultado inteiro.

---

## Exemplo

```java
int a, b;
double resultado;

a = 5;
b = 2;

resultado = a / b;
```

### Resultado

```text
2.0
```

Mesmo que `resultado` seja `double`, a operação `a / b` foi realizada entre dois inteiros.

```text
5 / 2 = 2
```

Depois o Java apenas converte o valor para:

```text
2.0
```

---

## ✅ Solução: Converter um dos Valores

```java
resultado = (double) a / b;
```

Agora:

```text
5.0 / 2 = 2.5
```

### Resultado

```text
2.5
```

---

# 🔽 Convertendo Double para Int

Nem toda conversão é automática.

---

## Exemplo com Erro

```java
double a;
int b;

a = 5.3;

b = a;
```

### Erro

```text
possible lossy conversion from double to int
```

O Java não permite essa conversão automaticamente porque pode haver perda de informação.

---

## ✅ Conversão Forçada

```java
b = (int) a;
```

### Resultado

```text
5
```

---

## ⚠️ Atenção

Ao converter um `double` para `int`:

```java
double a = 5.9;

int b = (int) a;
```

Resultado:

```text
5
```

A parte decimal é descartada.

```text
5.9 → 5
```

> Os valores após a vírgula são perdidos.

---

# ⌨️ Entrada de Dados

Para receber informações digitadas pelo usuário utilizamos a classe **Scanner**.

---

# 📦 Scanner

## Importação

Antes de utilizar o Scanner é necessário importar a biblioteca:

```java
import java.util.Scanner;
```

---

## Criando um Scanner

```java
Scanner sc = new Scanner(System.in);
```

### Significado

| Elemento    | Função                   |
| ----------- | ------------------------ |
| `Scanner`   | Tipo da variável         |
| `sc`        | Nome da variável         |
| `System.in` | Entrada padrão (teclado) |

---

## Liberando Memória

Ao finalizar o uso do Scanner:

```java
sc.close();
```

### Função

* Fecha o Scanner
* Libera recursos utilizados na memória

---

# 🔤 Ler uma Palavra

Para ler uma única palavra (sem espaços), utilizamos:

```java
String nome;

nome = sc.next();
```

### Entrada

```text
Maria
```

### Valor armazenado

```text
Maria
```

---

## ⚠️ Atenção

Se o usuário digitar:

```text
Maria Silva
```

Apenas:

```text
Maria
```

será armazenado.

---

# 🔢 Ler um Número Inteiro

Utilizamos:

```java
int num;

num = sc.nextInt();
```

### Entrada

```text
10
```

### Valor armazenado

```text
10
```

---

# 🔣 Ler um Número com Casas Decimais

Utilizamos:

```java
double valor;

valor = sc.nextDouble();
```

---

## 🌎 Locale e Números Decimais

O `nextDouble()` segue a configuração regional do sistema.

### Exemplo

No Brasil:

```text
10,5
```

Nos Estados Unidos:

```text
10.5
```

---

## Utilizando Ponto Decimal

```java
import java.util.Locale;

Locale.setDefault(Locale.US);
```

⚠️ Deve ser executado antes da criação do Scanner.

### Exemplo

```java
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        System.out.println(valor);

        sc.close();
    }
}
```

---

# 🔠 Ler um Caractere

Para ler apenas um caractere:

```java
char letra;

letra = sc.next().charAt(0);
```

---

## Como Funciona?

### `sc.next()`

Lê uma palavra.

### `.charAt(0)`

Retorna o caractere da posição 0.

---

## Exemplo

Entrada:

```text
Java
```

Resultado:

```text
J
```

---

# 📄 Ler uma Linha Inteira

Para ler tudo até o usuário pressionar Enter:

```java
String linha;

linha = sc.nextLine();
```

---

## Exemplo

Entrada:

```text
Maria da Silva
```

Resultado:

```text
Maria da Silva
```

Diferente do `next()`, ele aceita espaços.

---

# ⚠️ Problema do Buffer de Leitura

Um dos erros mais comuns ao utilizar Scanner.

---

## Situação

```java
int num;
String linha;

num = sc.nextInt();
linha = sc.nextLine();
```

Entrada:

```text
10
Maria
```

---

## O que acontece?

Quando digitamos:

```text
10 ↵
```

O Enter permanece no buffer de entrada.

O próximo comando:

```java
sc.nextLine();
```

consome imediatamente esse Enter.

Resultado:

```text
linha = ""
```

---

# 🧹 Limpando o Buffer

Para resolver o problema:

```java
num = sc.nextInt();

sc.nextLine();

linha = sc.nextLine();
```

---

## Fluxo

```text
nextInt()
    ↓
Enter fica pendente
    ↓
nextLine()
    ↓
Consome o Enter
    ↓
nextLine()
    ↓
Lê corretamente a linha
```

---

# 📌 Regra Importante

Todos os métodos abaixo deixam o Enter pendente:

```java
next()
nextInt()
nextDouble()
nextFloat()
nextLong()
nextBoolean()
```

---

## Exceção

```java
nextLine()
```

Ele já consome toda a linha, incluindo a quebra de linha.

---

# 📚 Resumo

## 🔄 Casting

### Int → Double

```java
(double) a
```

### Double → Int

```java
(int) a
```

⚠️ Perde a parte decimal.

---

## 📥 Scanner

### Criar Scanner

```java
Scanner sc = new Scanner(System.in);
```

### Fechar Scanner

```java
sc.close();
```

---

## 📖 Métodos de Leitura

| Método             | Lê            |
| ------------------ | ------------- |
| `next()`           | Palavra       |
| `nextInt()`        | Inteiro       |
| `nextDouble()`     | Decimal       |
| `next().charAt(0)` | Caractere     |
| `nextLine()`       | Linha inteira |

---

## ⚠️ Buffer de Leitura

Após:

```java
nextInt()
nextDouble()
next()
```

Se precisar usar:

```java
nextLine()
```

Faça antes:

```java
sc.nextLine();
```

para consumir o Enter pendente.

---
