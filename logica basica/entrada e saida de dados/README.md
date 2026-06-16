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

