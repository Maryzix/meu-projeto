
# 📚 Revisão de Java — Padrão Singleton

## 1. O que o padrão Singleton garante?

**Resposta correta: B) Que exista apenas um objeto da classe no programa.**

O Singleton é um padrão de projeto que busca garantir que uma classe tenha apenas uma instância e disponibilize um ponto de acesso a ela.

Isso permite que diferentes partes do programa utilizem o mesmo objeto, em vez de criarem várias instâncias da classe.

---

## 2. Por que o construtor de um Singleton é `private`?

**Resposta:**

O construtor é declarado como `private` para impedir que outras classes criem objetos diretamente utilizando `new`.

Dessa forma, a própria classe controla a criação de sua instância, garantindo que outras partes do programa não consigam criar objetos diretamente por meio do construtor.

O objeto Singleton pode ser compartilhado entre diferentes partes do programa. O que se busca evitar é a criação de várias instâncias da mesma classe.

---

## 3. Complete a lacuna

```java
private ______ Configuracao instancia;
```

Alternativas:

- a) `final`
- b) `public`
- c) `static`
- d) `void`

**Resposta correta: C) `static`.**

O atributo `static` pertence à classe, e não a cada objeto individual.

A declaração fica assim:

```java
private static Configuracao instancia;
```

Nesse exemplo, `instancia` é uma referência compartilhada pela classe, permitindo que um método estático controle o acesso ao objeto Singleton.

---

## 4. O que acontece se alguém tentar escrever isto fora da classe?

```java
Configuracao c = new Configuracao();
```

**Resposta:**

Se o construtor da classe `Configuracao` for `private`, ocorrerá um erro de compilação.

Isso acontece porque uma classe externa não tem permissão para chamar diretamente o construtor privado.

Exemplo:

```java
public class Configuracao {

    private static Configuracao instancia;

    private Configuracao() {
    }
}
```

Nesse caso, não podemos criar um objeto utilizando `new Configuracao()` fora da classe.

A instância deve ser obtida por meio de um método disponibilizado pela própria classe.

---

## 5. Qual é a forma correta de obter o objeto de um Singleton chamado `Configuracao`?

Alternativas:

- a) `new Configuracao()`
- b) `Configuracao.getInstancia()`
- c) `Configuracao.instancia`
- d) `this.getInstancia()`

**Resposta correta: B) `Configuracao.getInstancia()`.**

O método `getInstancia()` é utilizado para fornecer acesso à instância controlada pela classe.

Exemplo de implementação:

```java
public class Configuracao {

    private static Configuracao instancia;

    private Configuracao() {
    }

    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }

        return instancia;
    }
}
```

Para utilizar o Singleton:

```java
Configuracao c = Configuracao.getInstancia();
```

Na primeira chamada, o método cria a instância. Nas chamadas seguintes, retorna a mesma instância existente.

Essa abordagem é chamada de *lazy initialization*, pois o objeto só é criado quando necessário.

---

## 🧠 Resumo para memorizar

| Elemento | Função |
|---|---|
| `private` | Impede que outras classes chamem diretamente o construtor privado. |
| `static` | Faz o atributo ou método pertencer à classe. |
| `getInstancia()` | Permite obter a instância controlada pela classe. |
| `new Configuracao()` | Não pode ser usado externamente quando o construtor é privado. |
| `instancia == null` | Verifica se a instância ainda precisa ser criada. |

## ✅ Gabarito

| Questão | Resposta |
|---|---|
| 1 | B |
| 2 | Impedir a criação direta de objetos por outras classes. |
| 3 | C — `static` |
| 4 | Erro de compilação, se o construtor for `private`. |
| 5 | B — `Configuracao.getInstancia()` |

## Conclusão

O padrão Singleton controla a criação de objetos para que uma classe tenha uma única instância compartilhada.

Para lembrar:

- **`private`:** controla a criação do objeto.
- **`static`:** mantém a referência associada à classe.
- **`getInstancia()`:** fornece acesso à instância existente.
