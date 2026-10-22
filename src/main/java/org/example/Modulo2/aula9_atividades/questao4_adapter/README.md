Questão 4. 

Seu sistema precisa usar uma classe de pagamento de outra empresa, mas ela não implementa a sua interface. Por que não dá para simplesmente escrever implements na classe dela? O que você faz no lugar?

Não dá para simplesmente usar implements porque não podemos alterar diretamente a classe de outra empresa para implementar nossa interface. Em vez disso, criamos um Adapter, que implementa nossa interface e adapta a comunicação entre o nosso sistema e a classe externa.

Questão 5.

Em um Adapter, onde fica a tradução (por exemplo, a conversão de dólar para real)?
• a) Na classe de fora
• b) Na interface
• c) No método implementado da interface, dentro do adapter - Correta
• d) No main, antes de chamar o método
