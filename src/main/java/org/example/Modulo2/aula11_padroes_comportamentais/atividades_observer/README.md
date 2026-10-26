1 - Qual problema o padrão Observer resolve? Dê um exemplo do dia a dia que funcione como ele.

O padrão Observer resolve o problema de manter diferentes objetos informados quando ocorre uma mudança em outro objeto, sem precisar chamar cada um deles individualmente.

Exemplo do dia a dia: um aplicativo de entrega. Quando o pedido muda de status para “Saiu para entrega”, o cliente e o entregador podem receber uma notificação automaticamente, sem que o pedido precise conhecer os detalhes de cada um deles.


2 - No Observer, o que é o Subject  e o que é o Observer? Como o Subject avisa os observadores sem conhecer as classes concretas deles?

O Subject é o objeto que possui as informações e avisa os outros quando ocorre alguma mudança. Já o Observer é quem recebe essas notificações.

O Subject consegue avisar os observadores por meio de uma interface comum, sem precisar conhecer as classes concretas. Assim, ele pode notificar diferentes tipos de objetos que implementam essa interface, sem depender de suas implementações específicas.

3 - Se você precisar adicionar um novo interessado, por exemplo um Entregador que também precisa saber quando o pedido muda de status, o que é preciso alterar na classe Pedido? Por quê?

Não seria necessário alterar a classe Pedido. Bastaria criar a classe Entregador, implementar a interface Observer e registrá-la como observadora do pedido.

Isso acontece porque o padrão Observer permite adicionar novos observadores sem modificar o Subject, favorecendo o baixo acoplamento e o princípio Open/Closed (OCP) do SOLID: as classes devem estar abertas para extensão, mas fechadas para modificação.
