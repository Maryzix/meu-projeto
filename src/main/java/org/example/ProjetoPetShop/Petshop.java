package org.example.ProjetoPetShop;

import org.example.Modulo1.aula5_revisao.Aluna;

import java.util.Scanner;

public class Petshop {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        Pet pet = new Pet();

        System.out.println("=== FICHA DO PET ===\n");
        System.out.println("Digite o nome do animal: ");
        pet.nome = sc.nextLine();
        System.out.println("Espécie: ");
        pet.especie = sc.nextLine();
        System.out.printf("Peso: ");
        pet.peso = sc.nextDouble();

        System.out.printf("\nNome do pet: " + pet.nome);
        System.out.printf("\nEspécie: " + pet.especie);
        System.out.printf("\nPeso: %.1fkg", pet.peso);
        pet.definirPorte();


    }
}
