# 🏗️ Introdução à Programação Orientada a Objetos (POO)

A **Programação Orientada a Objetos (POO)** é um paradigma de programação baseado na criação e interação de **objetos**.

Em vez de pensar apenas em funções e dados separados, a POO organiza o sistema em objetos que possuem características e comportamentos.

---

# 📦 O que é uma Classe?

Uma **classe** é um **tipo estruturado** que serve como modelo para a criação de objetos.

Podemos imaginar uma classe como:

* 🏠 Uma planta de uma casa
* 🧩 Um molde
* 📋 Um projeto

A classe define quais informações e comportamentos os objetos terão.

---

## Componentes de uma Classe

Uma classe pode conter:

### 📊 Atributos

Representam os dados ou características do objeto.

### ⚙️ Métodos

Representam as ações ou comportamentos do objeto.

---

## Exemplo

```java
public class EventoJunino {

    public String local;
    public double valorIngresso;

}
```

### Atributos

```java
local
valorIngresso
```

Esses atributos representam características de um evento junino.

---

# 🚀 Recursos da Programação Orientada a Objetos

Além de atributos e métodos, as classes podem utilizar diversos recursos importantes:

## 🏗️ Construtores

Responsáveis pela criação e inicialização dos objetos.

---

## 🔄 Sobrecarga

Permite criar métodos com o mesmo nome, mas com parâmetros diferentes.

---

## 🔒 Encapsulamento

Protege os dados internos do objeto.

---

## 👨‍👩‍👧 Herança

Permite que uma classe reutilize características de outra.

---

## 🎭 Polimorfismo

Permite que um mesmo método tenha comportamentos diferentes dependendo do contexto.

---

# 📝 Declarar x Instanciar

Um dos conceitos mais importantes da POO.

---

## Declarar

Quando declaramos uma variável de um tipo classe, estamos apenas criando uma referência.

### Exemplo

```java
EventoJunino arraia;
```

Nesse momento:

✅ A variável existe

❌ O objeto ainda não existe

---

## Instanciar

Instanciar significa criar efetivamente o objeto na memória.

### Exemplo

```java
arraia = new EventoJunino();
```

A palavra-chave:

```java
new
```

cria um novo objeto.

---

## Exemplo Completo

```java
public class EventoJunino {

    public String local;
    public double valorIngresso;

}
```

```java
EventoJunino arraia;

arraia = new EventoJunino();
```

---

# ⚠️ Importante

Somente declarar:

```java
EventoJunino arraia;
```

não cria o objeto.

A variável ficará apontando para:

```java
null
```

---

## Situação

```java
EventoJunino arraia;
```

Memória:

```text
STACK
└── arraia → null
```

---

# 📦 Objeto

Após instanciar:

```java
arraia = new EventoJunino();
```

temos um objeto criado.

---

## Memória

```text
STACK
└── arraia → endereço do objeto

HEAP
└── Objeto EventoJunino
```

---

# 🧠 Memória Stack x Heap

Para entender objetos, precisamos conhecer duas regiões importantes da memória.

---

# 📚 Stack (Pilha)

A memória **Stack** armazena:

* Variáveis locais
* Referências para objetos
* Dados temporários

Ela é rápida e organizada em formato de pilha.

---

## Exemplo

```java
EventoJunino arraia;
```

Memória:

```text
STACK
└── arraia → null
```

Apenas a variável foi criada.

---

# 🏢 Heap

A memória **Heap** é utilizada para armazenar objetos criados dinamicamente.

Todos os objetos instanciados com:

```java
new
```

são armazenados na Heap.

---

# 🔗 Relação entre Stack e Heap

Quando um objeto é criado:

1. O objeto fica na Heap.
2. A variável fica na Stack.
3. A variável armazena o endereço do objeto.

---

## Exemplo Visual

### Antes da instanciação

```java
EventoJunino arraia;
```

```text
STACK
┌──────────┐
│ arraia   │
│  null    │
└──────────┘
```

---

### Depois da instanciação

```java
arraia = new EventoJunino();
```

```text
STACK
┌─────────────┐
│ arraia      │
│ 0x100358    │
└─────────────┘
       │
       ▼

HEAP
┌─────────────────────┐
│ EventoJunino        │
│ local = null        │
│ valorIngresso = 0.0 │
└─────────────────────┘
```

---

# 📍 O que é um Ponteiro (Referência)?

A variável:

```java
EventoJunino arraia;
```

não guarda o objeto.

Ela guarda uma referência (endereço) para o objeto.

---

