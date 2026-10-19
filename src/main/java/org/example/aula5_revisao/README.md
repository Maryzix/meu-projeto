Questão 1: Abstração
a) Explique, com suas palavras, o que é abstração em programação orientada a objetos.

b) Qual a diferença entre abstração e encapsulamento?

c) Quando você usa lista.add("Ana"), você sabe como o Java guarda esse elemento na memória? Por que isso é um exemplo de abstração?


Questão 2: SOLID
Para cada código abaixo, diga qual princípio do SOLID está sendo violado e explique como você corrigiria.



a)
java
class Relatorio {
void calcularTotais() { /* ... */ }
void formatarEmPdf() { /* ... */ }
void salvarNoDisco() { /* ... */ }
void enviarPorEmail() { /* ... */ }
}

b)
java
class EnviadorEmail {
void enviar(String tipo) {
if (tipo.equals("aniversario")) {
System.out.println("Feliz aniversário!");
} else if (tipo.equals("seguranca")) {
System.out.println("Alerta de segurança!");
} else if (tipo.equals("promocao")) {
System.out.println("Promoção imperdível!");
}
}
}

c)
java
class PedidoService {
private MySQLRepositorio repo = new MySQLRepositorio();

    void finalizar() {
        repo.salvar();
    }
}





Questão 4: Modificadores de acesso

Explique quem pode acessar um atributo ou método declarado com cada modificador:

a) private - Mesma classe 

b) default (sem modificador) - Mesma classe e Mesmo pacote

c) protected Mesma Classe, Mesmo Pacote, Subclasse Externa

d) public - Mesma Classe, Mesmo Pacote, Subclasse Externa, Mundo Externo