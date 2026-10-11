package org.example.ProjetoPetShop;

import org.example.Modulo1.aula5_revisao.Aluna;

import java.util.Scanner;

public class Petshop {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        Pet pet = new Pet();
        Pet[] lista = new Pet[5];

        System.out.println("=== CADASTRO DO PET ===\n");

        System.out.print("Digite o nome do animal: ");
        pet.nome = sc.nextLine();

        System.out.print("Espécie: ");
        pet.especie = sc.nextLine();

        System.out.print("Peso: ");
        pet.peso = sc.nextDouble();

        lista[0] = pet;

        System.out.println("\n--- PETS CADASTRADOS ---");

        System.out.printf(
                "%s (%s) - %.1f kg - Porte %s%n",
                lista[0].nome,
                lista[0].especie,
                lista[0].peso,
                lista[0].definirPorte()
        );
        sc.close();
    }
}
