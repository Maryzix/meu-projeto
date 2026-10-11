package org.example.ProjetoPetShop;

public class Petshop {
    public static void main (String [] args){
        String nome = "Mel";
        String especie = "Cachorro";
        double peso = 8.5;

        System.out.println("=== FICHA DO PET ===\n");
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.printf("Peso: %.1fkg\n", peso);
    }
}
