package org.example.ProjetoPetShop;

public class Cachorro extends Pet {

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Au au!");
    }
}