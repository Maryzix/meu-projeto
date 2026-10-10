package org.example.Modulo1.aula11_atividades_interfaces;

public class Atividade1 {
    //1. Crie uma interface Animal com o metodo emitirSom().
    //   Crie a classe Cachorro que implementa ela e imprime "Au au!".
    //   Na Main, crie um cachorro e chame o metodo. Não esqueça do @Override.

    public static void main(String[] args) {
        Cachorro pluto = new Cachorro();
        pluto.emitirSom();
    }
}
