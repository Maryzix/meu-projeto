package org.example.ProjetoPetShop;

import org.example.Modulo1.aula5_revisao.Aluna;

import java.util.Scanner;

public class Petshop {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        Pet nome = new Pet();

        System.out.println("=== FICHA DO PET ===\n");
        System.out.println("Digite o nome do animal: ");
        nome.nome = sc.nextLine();
        System.out.println("Espécie: ");
        nome.especie = sc.nextLine();
        System.out.printf("Peso: ");
        nome.peso = sc.nextDouble();

        System.out.printf("\nNome do pet: " + nome.nome);
        System.out.printf("\nEspécie: " + nome.especie);
        System.out.printf("\nPeso: %.1fkg", nome.peso);

        if(nome.peso < 10){
            System.out.println("\nPorte: Pequeno");
        } else if(nome.peso >= 10 && nome.peso <= 25){
            System.out.println("\nPorte: Médio");
        }else {
            System.out.println("\nPorte: Grande");
        }
    }
}
