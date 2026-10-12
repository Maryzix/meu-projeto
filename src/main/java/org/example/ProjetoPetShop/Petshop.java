
package org.example.ProjetoPetShop;

import java.util.Scanner;

public class Petshop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pet[] lista = new Pet[5];

        int opcao = -1;
        int total = 0;

        boolean continuar = true;

        while (continuar) {

            System.out.println("\n===== SISTEMA DE CADASTRO DE PETS =====");
            System.out.println("1 - Cadastrar Pet");
            System.out.println("2 - Listar Pets");
            System.out.println("0 - Sair");
            System.out.print("Digite uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    if (total >= lista.length) {
                        System.out.println("Limite de pets atingido!");
                        break;
                    }

                    Pet pet = new Pet();

                    System.out.print("Digite o nome do animal: ");
                    pet.nome = sc.nextLine();

                    System.out.print("Espécie: ");
                    pet.especie = sc.nextLine();

                    System.out.print("Peso: ");
                    pet.peso = sc.nextDouble();
                    sc.nextLine();

                    lista[total] = pet;
                    total++;

                    System.out.println(
                            "Pet cadastrado! Agora são "
                                    + total + " pet(s)."
                    );

                    break;
                case 2:
                    if (total == 0) {
                        System.out.println("Nenhum pet cadastrado.");
                    } else {
                        System.out.println("\n--- PETS CADASTRADOS ---");

                        for (int i = 0; i < total; i++) {
                            System.out.printf(
                                    "%s (%s) - %.1f kg - Porte %s%n",
                                    lista[i].nome,
                                    lista[i].especie,
                                    lista[i].peso,
                                    lista[i].definirPorte()
                            );
                        }
                    }
                    break;
                case 0:
                    System.out.println("Até logo!");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        sc.close();
    }
}
