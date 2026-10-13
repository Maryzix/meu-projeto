package org.example.ProjetoPetShop;

public class Pet {

    public String nome;
    public String especie;
    public double peso;

    public String definirPorte() {
        if (peso < 10) {
            return "Pequeno";
        } else if (peso <= 25) {
            return "Médio";
        } else {
            return "Grande";
        }
    }
}