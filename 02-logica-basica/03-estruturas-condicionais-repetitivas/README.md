# 🔀 Estruturas Condicionais e Repetitivas em Java

As estruturas de controle permitem alterar o fluxo normal de execução de um programa, tomando decisões ou repetindo ações conforme determinadas condições.

---

# ⚖️ Expressões Comparativas

As expressões comparativas são utilizadas para comparar valores.

O resultado de uma comparação sempre será:

```java id="x3w4aq"
true
```

ou

```java id="j4xj6x"
false
```

---

## Operadores Comparativos

| Operador | Significado    |
| -------- | -------------- |
| `>`      | Maior que      |
| `<`      | Menor que      |
| `>=`     | Maior ou igual |
| `<=`     | Menor ou igual |
| `==`     | Igual          |
| `!=`     | Diferente      |

---

## Exemplos

```java id="sajh6f"
10 > 5
```

Resultado:

```java id="mctc7x"
true
```

---

```java id="6gprn6"
10 == 20
```

Resultado:

```java id="6g1s36"
false
```

---

```java id="y6yxh4"
10 != 20
```

Resultado:

```java id="d3eqe9"
true
```

---

# 🧠 Expressões Lógicas

As expressões lógicas permitem combinar condições.

Também retornam:

```java id="j2pzt6"
true
```

ou

```java id="6gzg2s"
false
```

---

## Operadores Lógicos

| Operador | Significado |   |         |
| ------- | ----------- | - | ------- |
| `&&`    | E (AND)     |   |         |
|         |             | ` | OU (OR) |
| `!`     | NÃO (NOT)   |   |         |

---

## Operador AND (`&&`)

Retorna verdadeiro apenas se todas as condições forem verdadeiras.

### Exemplo

```java id="97wgni"
idade >= 18 && idade < 60
```

---

## Operador OR (`||`)

Retorna verdadeiro se pelo menos uma condição for verdadeira.

### Exemplo

```java id="h3ptz6"
idade < 18 || idade >= 60
```

---

## Operador NOT (`!`)

Inverte o valor lógico.

### Exemplo

```java id="n9i0n8"
!true
```

Resultado:

```java id="tvs1ae"
false
```

---

# 🔀 Estrutura Condicional

As estruturas condicionais permitem executar blocos de código apenas quando determinadas condições são satisfeitas.

---

# ✅ Estrutura Simples (if)

Executa um bloco apenas se a condição for verdadeira.

## Sintaxe

```java id="lmqsc0"
if (condicao) {
    blocoDeCodigo;
}
```

---

## Exemplo

```java id="9s2ij4"
int idade = 20;

if (idade >= 18) {
    System.out.println("Maior de idade");
}
```

---

# 🔄 Estrutura Composta (if-else)

Permite executar um bloco alternativo quando a condição for falsa.

## Sintaxe

```java id="pl5scq"
if (condicao) {
    bloco1;
}
else {
    bloco2;
}
```

---

## Exemplo

```java id="dl7w9x"
int idade = 15;

if (idade >= 18) {
    System.out.println("Maior de idade");
}
else {
    System.out.println("Menor de idade");
}
```

---

# 🔀 Estrutura Encadeada (else if)

Utilizada quando existem múltiplas condições.

## Sintaxe

```java id="aqnz3u"
if (condicao1) {

}
else if (condicao2) {

}
else {

}
```

---

## Exemplo

```java id="c52d89"
int nota = 75;

if (nota >= 90) {
    System.out.println("A");
}
else if (nota >= 70) {
    System.out.println("B");
}
else {
    System.out.println("C");
}
```

---

# ➕ Operadores de Atribuição Cumulativa

Permitem atualizar uma variável utilizando seu valor atual.

---

## Operadores

| Operador | Equivalente     |
| -------- | --------------- |
| `+=`     | `x = x + valor` |
| `-=`     | `x = x - valor` |
| `*=`     | `x = x * valor` |
| `/=`     | `x = x / valor` |
| `%=`     | `x = x % valor` |

---

## Exemplos

### Soma

```java id="hgmjlwm"
int x = 10;

x += 5;
```

Resultado:

```java id="pwj9nv"
15
```

---

### Multiplicação

```java id="cnk7r6"
int x = 10;

x *= 2;
```

Resultado:

```java id="b4z6zf"
20
```

---

# 🔀 Estrutura Switch-Case

Ideal quando existem várias opções baseadas no valor de uma única variável.

---

## Sintaxe

```java id="lyvv5m"
switch (x) {

    case 1:
        bloco1;
        break;

    case 2:
        bloco2;
        break;

    default:
        bloco3;
        break;
}
```

---

## Funcionamento

### Se `x == 1`

Executa:

```java id="e9umc8"
bloco1;
```

---

### Se `x == 2`

Executa:

```java id="v1g1ry"
bloco2;
```

---

### Caso contrário

Executa:

```java id="o3ymgk"
bloco3;
```

---

## Exemplo

```java id="52r2xf"
int dia = 3;

switch (dia) {

    case 1:
        System.out.println("Domingo");
        break;

    case 2:
        System.out.println("Segunda");
        break;

    case 3:
        System.out.println("Terça");
        break;

    default:
        System.out.println("Dia inválido");
        break;
}
```

---

## ⚠️ Importância do break

O `break` interrompe a execução do switch.

Sem ele, os próximos casos também serão executados.

---

# ⚡ Operador Ternário

É uma forma simplificada do `if-else`.

Utilizado quando queremos atribuir um valor a uma variável.

---

## Sintaxe

```java id="n8suhh"
(condicao) ? valorSeTrue : valorSeFalse
```

---

## Exemplo 1

```java id="dg5tr4"
int idade = 10;

String frase;

frase = (idade >= 18)
    ? "Maior de idade"
    : "Menor de idade";
```

---

## Exemplo 2

```java id="jbhh2n"
double desconto;

desconto = (preco > 20)
    ? preco * 0.10
    : preco * 0.05;
```

---

# 📦 Escopo de Variáveis

O escopo define onde uma variável pode ser utilizada.

---

## Variáveis Dentro de um Bloco

```java id="3gnt9d"
if (true) {

    int x = 10;

}
```

A variável:

```java id="jlwmvb"
x
```

existe apenas dentro do bloco `if`.

---

## Após o Encerramento do Bloco

```java id="g5h7mv"
if (true) {

    int x = 10;

}

System.out.println(x);
```

Resultado:

```text id="hnh7vc"
Erro de compilação
```

---

# ⚠️ Inicialização de Variáveis

Uma variável precisa receber um valor antes de ser utilizada.

---

## Exemplo Problemático

```java id="gcd1i5"
double valor = 400.00;
double desconto;

if (valor < 200.00) {

    desconto = valor * 0.10;

}

System.out.println(desconto);
```

---

## Problema

Como:

```java id="hxf4gk"
valor = 400.00
```

a condição é falsa.

Logo:

```java id="tvfwx2"
desconto = valor * 0.10;
```

não será executado.

A variável ficará sem valor.

---

## Solução

Inicializar a variável ao declará-la.

```java id="qdzqvn"
double desconto = 0;
```

---

## Exemplo Correto

```java id="wwesvn"
double valor = 400.00;
double desconto = 0;

if (valor < 200.00) {

    desconto = valor * 0.10;

}

System.out.println(desconto);
```

---

# 🔁 Estruturas Repetitivas

As estruturas repetitivas permitem executar um bloco de código várias vezes.

---

# 🔄 While

O `while` executa um bloco enquanto uma condição for verdadeira.

---

## Quando Utilizar?

Quando **não sabemos previamente** quantas repetições serão necessárias.

---

## Sintaxe

```java id="dln19w"
while (condicao) {

    blocoDeCodigo;

}
```

---

## Fluxo

```text id="bb2g79"
Verifica condição
        ↓
     true
        ↓
Executa bloco
        ↓
Volta para condição
```

---

# Exemplo

```java id="w7m1mu"
int contador = 1;

while (contador <= 5) {

    System.out.println(contador);

    contador++;

}
```

### Saída

```text id="2a6vjm"
1
2
3
4
5
```

---

# ⚠️ Cuidado com Loops Infinitos

Se a condição nunca se tornar falsa, o laço nunca terminará.

### Exemplo

```java id="5t6bd2"
while (true) {

    System.out.println("Executando");

}
```

Resultado:

```text id="qnsnpv"
Loop infinito
```

---

# 🔢 Estrutura `for`

O `for` é utilizado quando a quantidade de repetições já é conhecida ou pode ser determinada antes da execução do laço.

---

## 📝 Sintaxe

```java
for (inicio; condicao; incremento) {

    blocoDeCodigo;

}
```

---

## Componentes do `for`

### 🚀 Início

Executado apenas uma vez, no começo do laço.

Geralmente utilizado para criar uma variável de controle.

```java
int i = 0;
```

---

### ⚖️ Condição

Verificada antes de cada repetição.

Enquanto for verdadeira, o laço continua executando.

```java
i < 10
```

---

### ➕

Executado ao final de cada repetição.

Normalmente utilizado para atualizar o contador.

```java
i++
```

---

## Fluxo de Execução

```text
Início
   ↓
Condição
   ↓
true
   ↓
Executa bloco
   ↓
Incremento
   ↓
Volta para condição
```

---

# 📌 Exemplo Básico

```java
int loops = 3;

for (int i = 0; i < loops; i++) {

    System.out.println("Executando...");

}
```

### Saída

```text
Executando...
Executando...
Executando...
```

---

# 🔢 Exemplo Contador

```java
for (int i = 1; i <= 5; i++) {

    System.out.println(i);

}
```

### Saída

```text
1
2
3
4
5
```

---

# 🔄 Estrutura `do-while`

O `do-while` é semelhante ao `while`, mas possui uma diferença importante:

> O bloco de código é executado pelo menos uma vez.

---

## Por quê?

Porque a condição é verificada somente no final.

---

## Sintaxe

```java
do {

    blocoDeCodigo;

} while (condicao);
```

---

## Fluxo de Execução

```text
Executa bloco
      ↓
Verifica condição
      ↓
true
      ↓
Executa novamente
```

---

# 📌 Exemplo Básico

```java
int x = 1;

do {

    System.out.println(x);

    x++;

} while (x <= 5);
```

### Saída

```text
1
2
3
4
5
```

---

# ⚠️ Diferença Entre `while` e `do-while`

## Exemplo com `while`

```java
int x = 10;

while (x < 5) {

    System.out.println("Executou");

}
```

### Saída

```text
(nada acontece)
```

A condição já começa falsa.

---

## Exemplo com `do-while`

```java
int x = 10;

do {

    System.out.println("Executou");

} while (x < 5);
```

### Saída

```text
Executou
```

Mesmo com a condição falsa, o bloco executa uma vez.

---

# 🎯 Quando Utilizar Cada Estrutura?

## 🔄 While

Quando não sabemos quantas repetições serão necessárias.

### Exemplos

* Menu de opções
* Login até acertar a senha
* Validação de entrada

---

## 🔢 For

Quando sabemos a quantidade de repetições.

### Exemplos

* Contar de 1 a 100
* Percorrer posições de um vetor
* Executar uma tarefa 10 vezes

---

## 🔁 Do-While

Quando o bloco precisa executar pelo menos uma vez.

### Exemplos

* Menus interativos
* Perguntar ao usuário se deseja continuar
* Sistemas que precisam exibir opções antes da validação

---

