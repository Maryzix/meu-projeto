
# 📚 Revisão de Java — POO, SOLID e Modificadores de Acesso

## 📌 Questão 1 — Abstração

### a) O que é abstração em programação orientada a objetos?

Abstração é representar as características e os comportamentos importantes de algo, escondendo os detalhes internos que não são necessários para utilizá-lo.

Em Java, podemos definir o que um objeto deve fazer sem precisar conhecer todos os detalhes de como isso funciona internamente.

### b) Qual a diferença entre abstração e encapsulamento?

- **Abstração:** destaca as características e os comportamentos relevantes de um objeto, simplificando sua utilização.
- **Encapsulamento:** protege os dados internos de uma classe e controla como eles podem ser acessados ou modificados, por exemplo, utilizando atributos `private` e métodos getters e setters.

### c) Por que `lista.add("Ana")` é um exemplo de abstração?

Ao utilizar `lista.add("Ana")`, conseguimos adicionar um elemento à lista sem precisar conhecer os detalhes internos de como o Java armazena e organiza esse elemento na memória.

O método `add()` oferece uma forma simples de utilizar a lista, escondendo a complexidade de sua implementação.

---

## 🧩 Questão 2 — Princípios SOLID

### a) Classe `Relatorio`

**Princípio violado: SRP — Single Responsibility Principle (Responsabilidade Única).**

A classe possui várias responsabilidades:

- Calcular totais;
- Formatar relatórios em PDF;
- Salvar arquivos no disco;
- Enviar relatórios por e-mail.

Isso dificulta a manutenção, pois alterações em diferentes funcionalidades podem exigir modificações na mesma classe.

**Como corrigir?**

Separar as responsabilidades em classes específicas, como `CalculadoraRelatorio`, `FormatadorPDF`, `ArmazenadorRelatorio` e `EnviadorEmail`.

Assim, cada classe fica responsável por uma tarefa principal.

### b) Classe `EnviadorEmail`

**Princípio violado: OCP — Open/Closed Principle (Aberto/Fechado).**

A classe precisa ser modificada sempre que um novo tipo de mensagem é adicionado, exigindo novos blocos `if` ou `else if`.

Isso dificulta a expansão e a manutenção do código.

**Como corrigir?**

Criar uma abstração para os diferentes tipos de mensagem, utilizando uma interface e implementações específicas, como `MensagemAniversario`, `MensagemSeguranca` e `MensagemPromocao`.

Dessa forma, novos tipos de mensagem podem ser adicionados sem precisar modificar a lógica principal do enviador.

### c) Classe `PedidoService`

**Princípio violado: DIP — Dependency Inversion Principle (Inversão de Dependência).**

A classe `PedidoService` depende diretamente da implementação concreta `MySQLRepositorio`, dificultando a substituição do mecanismo de armazenamento.

**Como corrigir?**

Criar uma interface `PedidoRepositorio`, implementada por `MySQLRepositorio`, e receber essa interface pelo construtor de `PedidoService`.

Assim, o serviço depende de uma abstração, e não diretamente de uma implementação específica.

---

## 🔐 Questão 4 — Modificadores de Acesso

| Modificador | Quem pode acessar? |
|---|---|
| `private` | Somente dentro da própria classe. |
| `default` | Classes do mesmo pacote. |
| `protected` | Própria classe, classes do mesmo pacote e subclasses de outros pacotes, respeitadas as regras de acesso. |
| `public` | Qualquer classe que consiga acessar o tipo que declara o membro. |

### Resumo

- **`private`:** restringe o acesso à própria classe.
- **`default`:** permite acesso dentro do pacote.
- **`protected`:** permite acesso no pacote e por subclasses, conforme as regras da linguagem.
- **`public`:** permite acesso mais amplo, inclusive entre pacotes.

---

## 🎯 Conclusão

Nesta atividade, revisei os conceitos de abstração e encapsulamento, os princípios SOLID e os modificadores de acesso do Java.

Esses conceitos são importantes para desenvolver aplicações mais organizadas, flexíveis, seguras e fáceis de manter.
