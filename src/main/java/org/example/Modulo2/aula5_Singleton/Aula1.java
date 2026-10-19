package org.example.Modulo2.aula5_Singleton;

public class Aula1 {
    public static void main(String[] args) {

        Atividade1 atividade1 = Atividade1.getInstancia();
        //Crie um atributo private static do tipo da própria classe. É onde o objeto único fica guardado. Começa como null.
        //Deixe o construtor private. Assim ninguém consegue usar new fora da classe.
        //Crie um metodo public static de acesso, geralmente chamado getInstancia().
        //Dentro dele, crie o objeto só se ainda não existir (if (instancia == null)).
        //Retorne sempre o mesmo objeto.
        //Acesse sempre pelo nome da classe: Classe.getInstancia(), nunca com new.

    }
}
