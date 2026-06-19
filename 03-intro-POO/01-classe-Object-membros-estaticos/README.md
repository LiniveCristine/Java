# ☕ Classe `Object` e Membros Estáticos em Java

## 🏛️ Classe `Object`

A classe `Object` é a **classe mãe de todas as classes em Java**.

Ela existe para fornecer funcionalidades básicas comuns a todos os objetos, promovendo:

* Padronização
* Reutilização de código
* Polimorfismo

> Toda classe criada em Java herda, direta ou indiretamente, da classe `Object`.

---

## 📦 Métodos Herdados da Classe `Object`

Como todas as classes são subclasses de `Object`, elas herdam alguns métodos importantes.

| Método       | Função                             |
| ------------ | ---------------------------------- |
| `getClass()` | Retorna o tipo do objeto           |
| `equals()`   | Compara se dois objetos são iguais |
| `hashCode()` | Retorna um código hash do objeto   |
| `toString()` | Converte o objeto para String      |

---

# 🔤 Método `toString()`

Como toda classe herda de `Object`, ela também possui o método:

```java
toString()
```

Sua função é retornar uma representação textual do objeto.

---

## Comportamento Padrão

```java
Pessoa p = new Pessoa();

System.out.println(p);
```

Saída padrão:

```text
Pessoa@6d06d69c
```

Essa saída geralmente não é útil para o usuário.

---

## Sobrescrevendo o `toString()`

Podemos definir como queremos que nosso objeto seja exibido.

### Exemplo

```java
public class Pessoa {

    public String nome;

    @Override
    public String toString() {
        return nome;
    }

}
```

---

### Utilização

```java
Pessoa p = new Pessoa();

p.nome = "Maria";

System.out.println(p);
```

Saída:

```text
Maria
```

---

## ⚠️ Conversão Implícita

Não é necessário chamar:

```java
p.toString();
```

Ao imprimir o objeto:

```java
System.out.println(p);
```

o Java executa o `toString()` automaticamente.

---

# ⚙️ Membros de Classe e Membros de Instância

Uma classe pode possuir:

* Atributos
* Métodos

Esses membros podem ser:

### 📦 De Instância

Dependem de objetos.

### 🏛️ Estáticos (`static`)

Pertencem à classe e não aos objetos.

---

# 📍 Membros de Instância

Para utilizá-los, é necessário criar um objeto.

### Exemplo

```java
Scanner sc = new Scanner(System.in);

int valor = sc.nextInt();
```

O método:

```java
nextInt()
```

é um membro de instância.

Precisamos primeiro criar:

```java
new Scanner(System.in)
```

---

# 📍 Membros Estáticos

Não precisam de objetos.

Podem ser acessados diretamente pelo nome da classe.

---

## Exemplo

```java
Math.sqrt(25);
```

Não precisamos fazer:

```java
Math m = new Math();
```

A chamada é feita diretamente pela classe.

---

## Resumo

### Instância

```java
objeto.metodo();
```

---

### Estático

```java
Classe.metodo();
```

---

# 🏛️ Classe Estática

Uma classe composta apenas por membros estáticos é considerada uma classe utilitária.

Ela geralmente não precisa ser instanciada.

### Exemplo

```java
Math.sqrt(9);
Math.pow(2, 3);
```

---

# 📌 Constantes Estáticas

Constantes normalmente são declaradas utilizando:

```java
static final
```

---

## Exemplo

```java
public static final double PI = 3.14159;
```

---

### Convenção

Constantes são escritas em letras maiúsculas.

```java
PI
MAX_VALUE
TAXA_JUROS
```

---

# ⚠️ Métodos Estáticos e Não Estáticos

Uma regra importante:

> Um método estático não pode acessar diretamente membros de instância.

---

## Exemplo

```java
public class Teste {

    public String nome;

    public static void mostrar() {

        System.out.println(nome);

    }

}
```

Resultado:

```text
Erro de compilação
```

---

## Por quê?

Porque o método estático pertence à classe.

Ele não sabe qual objeto deve utilizar.

---

# 🤔 Quando Utilizar `static`?

A pergunta principal é:

> Esse dado ou comportamento pertence ao objeto ou à classe?

---

## Use Instância Quando...

Cada objeto possui seus próprios dados.

### Exemplo

```java
Pessoa p1 = new Pessoa();
Pessoa p2 = new Pessoa();
```

Cada pessoa possui:

```java
nome
idade
cpf
```

diferentes.

---

## Use `static` Quando...

A informação é compartilhada por todos os objetos.

### Exemplos

* PI
* Contadores globais
* Configurações
* Utilidades matemáticas

---

# 🎪 Exemplo Prático: Evento Junino

## Classe

```java
public class EventoJunino {

    public String nomeAtracao;

    public static int totalIngressos = 0;

    public void anunciarAtracao() {

        System.out.printf(
            "Confirmado: %s%n",
            nomeAtracao
        );

    }

    public static void venderIngresso(int qtd) {

        totalIngressos += qtd;

    }

}
```

---

# 🎤 Atração = Membro de Instância

Cada show possui sua própria atração.

---

## Exemplo

```java
EventoJunino show1 = new EventoJunino();

show1.nomeAtracao = "João Gomes";

show1.anunciarAtracao();
```

Saída:

```text
Confirmado: João Gomes
```

---

### Por que não é `static`?

Porque cada objeto pode ter um valor diferente.

```text
Show 1 → João Gomes
Show 2 → Alceu Valença
Show 3 → Limão com Mel
```

---

# 🎟️ Ingressos = Membro Estático

O total de ingressos pertence ao evento inteiro.

Não faz sentido cada show ter um contador separado.

---

## Exemplo

```java
EventoJunino.venderIngresso(3);

EventoJunino.venderIngresso(2);
```

Resultado:

```java
EventoJunino.totalIngressos
```

Valor:

```text
5
```

---

## Por que é `static`?

Porque todos os objetos compartilham o mesmo valor.

```text
Evento Junino
├─ Show 1
├─ Show 2
├─ Show 3
└─ Total de ingressos vendidos
```

O contador pertence ao evento como um todo.

---
