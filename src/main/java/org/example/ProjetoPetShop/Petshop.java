package org.example.ProjetoPetShop;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Petshop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pet[] lista = new Pet[5];
        ArrayDeque<String> fila = new ArrayDeque<>();

        int opcao = -1;
        int total = 0;

        while (opcao != 0) {

            System.out.println("\n===== SISTEMA DE CADASTRO DE PETS =====");
            System.out.println("1 - Cadastrar Pet");
            System.out.println("2 - Listar Pets");
            System.out.println("3 - Procurar Pet");
            System.out.println("4 - Mostrar espécies cadastradas");
            System.out.println("5 - Entrar na fila de banho");
            System.out.println("6 - Atender próximo pet");
            System.out.println("7 - Executar serviços do petshop");
            System.out.println("0 - Sair");
            System.out.print("Digite uma opção: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {

                    case 1: {
                        if (total >= lista.length) {
                            System.out.println("Limite de pets atingido!");
                            break;
                        }

                        Pet pet;

                        System.out.print("Digite o nome do animal: ");
                        String nome = sc.nextLine();

                        System.out.print("Espécie: ");
                        String especie = sc.nextLine();

                        if (especie.equalsIgnoreCase("cachorro")) {
                            pet = new Cachorro();
                        } else if (especie.equalsIgnoreCase("gato")) {
                            pet = new Gato();
                        } else {
                            pet = new Pet();
                        }

                        pet.nome = nome;
                        pet.especie = especie;

                        System.out.print("Peso: ");
                        pet.peso = sc.nextDouble();
                        sc.nextLine();

                        lista[total] = pet;
                        total++;

                        System.out.println("Pet cadastrado com sucesso!");
                    }

                    case 2: {
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
                                lista[i].emitirSom();
                            }
                            if (total > 0) {
                                System.out.println();

                                mesmoNome(lista[0]);

                                System.out.println("---");

                                mesmoNome(lista[0], "=== FICHA DO PET ===");
                            }
                        }

                        break;
                    }

                    case 3: {
                        System.out.print("Nome do pet que deseja procurar: ");
                        String busca = sc.nextLine();

                        boolean achou = false;

                        for (int i = 0; i < total; i++) {
                            if (lista[i].nome.equalsIgnoreCase(busca)) {
                                System.out.printf(
                                        "%s (%s) - %.1f kg - Porte %s%n",
                                        lista[i].nome,
                                        lista[i].especie,
                                        lista[i].peso,
                                        lista[i].definirPorte()
                                );

                                achou = true;
                                break;
                            }
                        }

                        if (!achou) {
                            System.out.println("Pet não encontrado.");
                        }

                        break;
                    }

                    case 4: {
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
                    }

                    case 5: {
                        System.out.print("Nome do pet pra entrar na fila: ");
                        String nomePet = sc.nextLine();

                        boolean cadastrado = false;

                        for (int i = 0; i < total; i++) {
                            if (lista[i].nome.equalsIgnoreCase(nomePet)) {
                                cadastrado = true;
                                nomePet = lista[i].nome;
                                break;
                            }
                        }

                        if (!cadastrado) {
                            System.out.println(
                                    "Pet não cadastrado. Cadastre o pet antes de colocá-lo na fila."
                            );
                        } else {
                            fila.add(nomePet);

                            System.out.println(nomePet + " entrou na fila.");
                            System.out.println("Fila agora: " + fila);
                        }

                        break;
                    }

                    case 6: {
                        if (fila.isEmpty()) {
                            System.out.println(
                                    "A fila de banho está vazia. Nenhum pet para atender."
                            );
                        } else {
                            String proximo = fila.poll();

                            System.out.println("Próximo da fila: " + proximo);
                            System.out.println("Atendendo " + proximo + "...");
                            System.out.println("Fila agora: " + fila);
                        }

                        break;
                    }

                    case 7: {
                        if (fila.isEmpty()) {
                            System.out.println(
                                    "Nenhum pet na fila. Não há serviços para executar."
                            );
                            break;
                        }

                        String nomePet = fila.poll();

                        ArrayList<Servico> servicos = new ArrayList<>();

                        servicos.add(new Banho());
                        servicos.add(new Tosa());
                        servicos.add(new Consulta());

                        System.out.println("Próximo da fila: " + nomePet);

                        for (Servico servico : servicos) {
                            servico.executar(nomePet);
                        }

                        System.out.println("Serviços concluídos para " + nomePet + "!");
                        System.out.println("Fila agora: " + fila);

                        break;
                    }

                    case 0:
                        System.out.println("Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                sc.nextLine();
            }
        }

        sc.close();
    }

    static void mesmoNome(Pet pet) {
        System.out.println("Nome: " + pet.nome);
    }

    static void mesmoNome(Pet pet, String texto) {
        System.out.println(texto);
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.printf("Peso: %.1f kg%n", pet.peso);
        System.out.println("Porte: " + pet.definirPorte());
    }
}

