1.(Cenário Real) A equipe mexeu na classe CalculadoraFrete para adicionar entrega por Drone, mas sem querer estragou o cálculo antigo do Sedex. Qual é a principal vantagem de ter Testes Unitários nesse momento?

A) O teste unitário corrige o código do Sedex sozinho usando Inteligência Artificial.

B) O teste apita Vermelho imediatamente na máquina da programadora antes de o bug ir para o cliente (evitando regressão).

C) O teste substitui a necessidade de usar interfaces e princípios S.O.L.I.D. no projeto.

D) O teste deixa o banco de dados do sistema duas vezes mais rápido.

2. Olhando para a Pirâmide de Testes, por que os Testes Unitários ficam na base (representando cerca de 70% dos testes de uma empresa)?

   A) Porque eles testam a tela inteira clicando nos botões como um humano.
3. 
   B) Porque eles exigem que o banco de dados oficial esteja ligado.
4. 
   C) Porque eles testam pequenas partes isoladas do código, rodando em milissegundos e sendo muito mais baratos e fáceis de manter.
5. 
   D) Porque são feitos manualmente usando System.out.println no main.
   /Quiz Rápido: Vamos testar o conhecimento? (2/3)/

3. No JUnit 5, nós organizamos nosso método de teste seguindo o padrão AAA (Arrange, Act, Assert). O que fazemos na etapa "Assert"?

   A) Damos new na classe que queremos testar e preparamos as variáveis.

   B) Usamos os comandos do JUnit (como assertEquals ou assertTrue) para verificar se o resultado obtido bateu com o esperado.

   C) Apagamos os dados do banco de dados após o teste terminar.

   D) Imprimimos o resultado no console com System.out.println para conferir no olho.

4. Qual comando do JUnit 5 você deve usar para garantir que o método conta.sacar(-50.0) bloqueia a operação lançando uma exceção (IllegalArgumentException)?

   A) assertEquals(-50.0, conta.sacar(-50.0));

   B) assertFalse(conta.sacar(-50.0));

   C) assertNull(conta.sacar(-50.0));

   D) assertThrows(IllegalArgumentException.class, () -> conta.sacar(-50.0));
   /Quiz Rápido: Vamos testar o conhecimento? (3/3)/

5. No TDD (Test-Driven Development), trabalhamos no ciclo Red ➡️ Green ➡️ Refactor. O que significa a etapa "GREEN" (Verde)?

   A) Escrever o teste primeiro e ver ele falhar porque a classe ainda não existe.

   B) Escrever o código mais simples e direto possível na classe principal apenas para fazer o teste passar e ficar verde.

   C) Limpar o código, tirar repetições e aplicar boas práticas sem alterar o resultado.

   D) Enviar o código direto para o servidor de produção sem testar.

6. Responda:Na sinceridade: Por que testar o sistema apenas dando System.out.println() dentro do método main ("teste no olho") não funciona quando o projeto cresce na empresa?Detetive de Código: Uma colega escreveu um método de teste perfeito com assertEquals, clicou para rodar a classe de teste, mas o JUnit ignorou o método dela completamente! Qual anotação ela esqueceu de colocar em cima do método?

Refatoração sem medo: No ciclo do TDD, por que a gente só faz o Refactor (deixar o código bonito e limpo) depois que o teste já ficou Verde?
