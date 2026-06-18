# 📝 Funções para Manipulação de Strings em Java

Uma **String** é uma sequência de caracteres utilizada para armazenar textos.

Java fornece diversos métodos para manipular strings de forma simples e eficiente.

---

# 🔤 Formatar Strings

Métodos utilizados para alterar a aparência do texto.

---

## ⬇️ `toLowerCase()`

Converte todos os caracteres para minúsculo.

### Exemplo

```java
String original = "Meu Nome É Maria";

String lower = original.toLowerCase();

System.out.println(lower);
```

### Saída

```text
meu nome é maria
```

---

## ⬆️ `toUpperCase()`

Converte todos os caracteres para maiúsculo.

### Exemplo

```java
String original = "Meu Nome É Maria";

String upper = original.toUpperCase();

System.out.println(upper);
```

### Saída

```text
MEU NOME É MARIA
```

---

## ✂️ `trim()`

Remove espaços em branco no início e no final da string.

### Exemplo

```java
String original = "   Meu nome é Maria   ";

String texto = original.trim();

System.out.println(texto);
```

### Saída

```text
Meu nome é Maria
```

---

# ✂️ Recortar Strings

Permite extrair partes específicas de uma string.

Utilizamos o método:

```java
substring()
```

---

## 📌 `substring(inicio)`

Retorna a string a partir da posição informada.

### Exemplo

```java
String original = "Meu nome é Maria";

String sub1 = original.substring(2);

System.out.println(sub1);
```

### Saída

```text
u nome é Maria
```

---

### Entendendo os Índices

```text
M e u   n o m e   é   M a r i a
0 1 2 3 4 5 6 7 8 9 ...
```

A partir da posição:

```java
2
```

temos:

```text
u nome é Maria
```

---

## 📌 `substring(inicio, fim)`

Retorna uma parte da string.

### Regra

```text
Início → incluído
Fim → excluído
```

---

### Exemplo

```java
String original = "Meu nome é Maria";

String sub2 = original.substring(1, 5);

System.out.println(sub2);
```

### Saída

```text
eu n
```

---

### Entendendo

```text
M e u   n o m e
0 1 2 3 4 5 6 7
```

Posição inicial:

```java
1
```

→ começa em:

```text
e
```

Posição final:

```java
5
```

→ para antes do índice 5.

Resultado:

```text
eu n
```

---

# 🔄 Substituir Conteúdo

Permite trocar caracteres ou palavras.

Utilizamos:

```java
replace()
```

---

## 🔤 Substituir Caracteres

### Sintaxe

```java
replace(charAntigo, charNovo)
```

### Exemplo

```java
String original = "Meu nome é Maria";

String rep = original.replace('a', 'y');

System.out.println(rep);
```

### Saída

```text
Meu nome é Myriy
```

---

## 📝 Substituir Palavras

### Sintaxe

```java
replace(textoAntigo, textoNovo)
```

### Exemplo

```java
String original = "Meu nome é Maria";

String rep2 = original.replace("Maria", "Linive");

System.out.println(rep2);
```

### Saída

```text
Meu nome é Linive
```

---

# 🔍 Buscar Informações em uma String

Java possui métodos para localizar caracteres e palavras.

---

## 📌 `indexOf()`

Retorna o índice da primeira ocorrência.

### Exemplo

```java
String original = "Meu nome é Maria";

int loc = original.indexOf('M');

System.out.println(loc);
```

### Saída

```text
0
```

---

## Exemplo com Palavra

```java
int pos = original.indexOf("Maria");
```

Resultado:

```text
11
```

---

# 📌 `lastIndexOf()`

Retorna o índice da última ocorrência.

### Exemplo

```java
String texto = "banana";

int pos = texto.lastIndexOf('a');

System.out.println(pos);
```

### Saída

```text
5
```

---

## Comparação

```text
b a n a n a
0 1 2 3 4 5
```

### Primeira ocorrência

```java
indexOf('a')
```

Resultado:

```text
1
```

### Última ocorrência

```java
lastIndexOf('a')
```

Resultado:

```text
5
```

---

# 📦 Separar Strings (Split)

O método `split()` divide uma string em várias partes utilizando um separador.

O resultado é armazenado em um vetor (`array`).

---

## Sintaxe

```java
split("separador")
```

---

## Exemplo

```java
String original = "Meu nome é Maria";

String[] vetor = original.split(" ");
```

---

### Resultado

```text
vetor[0] = Meu
vetor[1] = nome
vetor[2] = é
vetor[3] = Maria
```

---

## Percorrendo o Vetor

```java
for (int i = 0; i < vetor.length; i++) {

    System.out.println(vetor[i]);

}
```

### Saída

```text
Meu
nome
é
Maria
```

---

