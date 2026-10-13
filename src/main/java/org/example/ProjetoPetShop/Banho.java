package org.example.ProjetoPetShop;

public class Banho implements Servico {

    @Override
    public void executar(String nomePet) {
        System.out.println("Dando banho em " + nomePet + "...");
    }
}