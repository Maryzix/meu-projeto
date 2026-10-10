package org.example.Modulo2.atividades_polimorfismo;

public class Atividade5 {
    public static void main (String[] args){

        //5. (herança — metodo que recebe a mãe)
        //   Crie um metodo na sua classe Main:

        //   static void mostrarFicha(Pessoa p) {
        //       p.apresentar();
        //   }
        //   Chame ele três vezes, passando a aluna, a professora e a estagiária.
        //   O metodo não sabe quem vai receber, e funciona pros três.

        Estagiaria estagiaria = new Estagiaria();
        estagiaria.nome = "Mary";
        estagiaria.idade = 25;

        Professora professora = new Professora();
        professora.nome = "Flora";
        professora.idade = 22;

        Aluna aluna = new Aluna();
        aluna.nome = "Carol";
        aluna.idade = 21;

        mostrarFicha(aluna);
        mostrarFicha(professora);
        mostrarFicha(estagiaria);
    }
    static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }
}
