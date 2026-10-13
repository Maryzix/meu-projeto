
package org.example.ProjetoPetShop;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Petshop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pet[] lista = new Pet[5];

        int opcao = -1;
        int total = 0;

        while (opcao != 0) {

            System.out.println("\n===== SISTEMA DE CADASTRO DE PETS =====");
            System.out.println("1 - Cadastrar Pet");
            System.out.println("2 - Listar Pets");
            System.out.println("3 - Procurar Pets");
            System.out.println("4 - Mostrar espécies cadastradas");
            System.out.println("0 - Sair");
            System.out.print("Digite uma opção: ");

            try {
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

                        // Continua pedindo até receber um peso válido
                        boolean pesoValido = false;

                        while (!pesoValido) {
                            try {
                                System.out.print("Peso em kg: ");
                                pet.peso = sc.nextDouble();
                                sc.nextLine();

                                if (pet.peso <= 0) {
                                    System.out.println(
                                            "O peso deve ser maior que zero."
                                    );
                                } else {
                                    pesoValido = true;
                                }

                            } catch (InputMismatchException e) {
                                System.out.println(
                                        "Digite um peso numérico válido!"
                                );
                                sc.nextLine();
                            }
                        }

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

                    case 3:
                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado.");
                            break;
                        }

                        boolean achou = false;

                        System.out.print(
                                "Digite o nome do animal que deseja procurar: "
                        );
                        String busca = sc.nextLine();

                        for (int i = 0; i < total; i++) {
                            if (lista[i].nome.equalsIgnoreCase(busca)) {
                                System.out.println(
                                        "O pet " + lista[i].nome
                                                + " está na lista:"
                                );

                                System.out.printf(
                                        "%s (%s) - %.1f kg - Porte %s%n",
                                        lista[i].nome,
                                        lista[i].especie,
                                        lista[i].peso,
                                        lista[i].definirPorte()
                                );

                                achou = true;
                            }
                        }

                        if (!achou) {
                            System.out.println("Pet não encontrado.");
                        }

                        break;

                    case 4:
                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado.");
                            break;
                        }

                        HashSet<String> especies = new HashSet<>();

                        for (int i = 0; i < total; i++) {
                            especies.add(lista[i].especie);
                        }

                        System.out.println("\n--- ESPÉCIES CADASTRADAS ---");

                        for (String especie : especies) {
                            System.out.println("- " + especie);
                        }

                        System.out.println(
                                "Total de espécies diferentes: " + especies.size()
                        );

                        break;

                    case 0:
                        System.out.println("Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
