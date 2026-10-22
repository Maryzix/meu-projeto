Questão 1. Explique com suas palavras qual problema o Factory resolve. O que aconteceria se os ifs que decidem qual objeto criar ficassem espalhados pelo main e por outras partes do programa, e depois surgisse um tipo novo?

O Factory resolve o problema de deixar a criação dos objetos espalhada pelo código. Ele centraliza essa responsabilidade em uma fábrica, deixando o main mais limpo e organizado. Se surgirem novos tipos, podemos ajustar a fábrica sem precisar espalhar novas condições e new por várias partes do programa, facilitando a manutenção do código.

Questão 2. O método da fábrica normalmente devolve o objeto criado com qual tipo?

• a) O tipo da classe concreta (ex.: Cachorro)

• b) O tipo da interface (ex.: Animal) - Correta

• c) String

• d) Não devolve nada (void)

