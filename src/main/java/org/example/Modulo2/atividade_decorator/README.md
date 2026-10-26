Questão 1

Criar uma classe para cada combinação é um problema porque a quantidade de classes cresce muito conforme adicionamos novos ingredientes.

Por exemplo, teríamos AcaiComGranola, AcaiComMorango, AcaiComGranolaEMorango, AcaiComGranolaMorangoEPacoca e muitas outras combinações. Isso deixa o código difícil de manter e aumenta a repetição.

O Decorator permite adicionar ingredientes dinamicamente, envolvendo um objeto Acai com outros objetos que também implementam a interface Acai. Assim, podemos combinar os adicionais sem criar uma classe para cada combinação.

Questão 2

Resposta correta: 

b) Para que um adicional também conte como açaí e possa ir dentro de outro adicional.

A classe AcaiDecorator implementa Acai porque precisa seguir o mesmo contrato do açaí simples: 

implementar getDescricao() e getPreco().

Assim, podemos fazer algo como:

new Morango(new Granola(new AcaiSimples()));


O Morango recebe um objeto Acai, que pode ser um AcaiSimples ou outro decorator, como Granola.