package org.example.ProjetoPetShop;

import java.util.Scanner;

public class Petshop {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        String nome;
        String especie;
        double peso;

        System.out.println("=== FICHA DO PET ===\n");
        System.out.println("Digite o nome do animal: ");
        nome = sc.nextLine();
        System.out.println("Espécie: ");
        especie = sc.nextLine();
        System.out.printf("Peso: ");
        peso = sc.nextDouble();

        System.out.printf("\nNome do pet: " + nome);
        System.out.printf("\nEspécie: " + especie);
        System.out.printf("\nPeso: %.1fkg", peso);

    }
}
