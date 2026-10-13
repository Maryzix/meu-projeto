package org.example.ProjetoPetShop;

public class Gato extends Pet {

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Miau!");
    }
}