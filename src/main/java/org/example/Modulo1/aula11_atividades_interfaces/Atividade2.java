package org.example.Modulo1.aula11_atividades_interfaces;

public class Atividade2 {
    public static void main(String[] args) {
        //2. Agora acrescente a classe Gato, que implementa a mesma interface e
        //   imprime "Miau!". Na main, declare as duas variáveis como Animal:
        //
        //   Animal bidu = new Cachorro();
        //   Animal salem= new Gato();
        //
        //   Chame emitirSom() nas duas.

        Gato sashimi = new Gato();
        Cachorro pudim = new Cachorro();
        sashimi.emitirSom();
        pudim.emitirSom();
    }
}
