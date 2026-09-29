package org.example.aula5revisao;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        7 - DESAFIO — Sistema de Cadastro de Alunas

        Você vai construir um programa que cadastra alunas, calcula a média delas
        e diz se foram aprovadas. O programa fica rodando até a pessoa escolher sair.
        */

        boolean continuar = true;

        // Lista que vai guardar todas as alunas cadastradas
        ArrayList<Aluna> alunas = new ArrayList<>();

        while (continuar) {

            System.out.println();
            System.out.println("===== SISTEMA DE CADASTRO DE ALUNAS DA MARY =====");
            System.out.println("1 - Cadastrar aluna e nota");
            System.out.println("2 - Mostrar alunas cadastradas");
            System.out.println("3 - Sair");
            System.out.print("Digite uma opção: ");

            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    Aluna aluna = new Aluna();

                    do {
                        System.out.print("Digite a primeira nota (0 a 10): ");
                        aluna.nota = sc.nextDouble();
                        if (aluna.nota < 0 || aluna.nota > 10) {
                            System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                        }
                    } while (aluna.nota < 0 || aluna.nota > 10);

                    do {
                        System.out.print("Digite a segunda nota (0 a 10): ");
                        aluna.nota2 = sc.nextDouble();
                        if (aluna.nota2 < 0 || aluna.nota2 > 10) {
                            System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                        }
                    } while (aluna.nota2 < 0 || aluna.nota2 > 10);

                    aluna.media = (aluna.nota + aluna.nota2) / 2;

                    sc.nextLine();

                    System.out.print("Digite o nome da aluna: ");
                    aluna.nome = sc.nextLine();

                    aluna.passou = aluna.media >= 6;

                    // Adiciona a aluna na lista
                    alunas.add(aluna);

                    String resultado;

                    if (aluna.passou) {
                        resultado = "Aprovada";
                    } else {
                        resultado = "Reprovada";
                    }

                    System.out.printf(
                            "%nNome: %s%nNota 1: %.1f%nNota 2: %.1f%nMédia: %.1f%nResultado: %s%n",
                            aluna.nome,
                            aluna.nota,
                            aluna.nota2,
                            aluna.media,
                            resultado
                    );

                    break;

                case 2:

                    if (alunas.isEmpty()) {
                        System.out.println("Nenhuma aluna cadastrada.");
                    } else {

                        System.out.println();
                        System.out.println("===== ALUNAS CADASTRADAS =====");

                        for (Aluna alunaCadastrada : alunas) {

                            String resultadoAluna;

                            if (alunaCadastrada.passou) {
                                resultadoAluna = "Aprovada";
                            } else {
                                resultadoAluna = "Reprovada";
                            }

                            System.out.printf(
                                    "%nNome: %s%nNota 1: %.1f%nNota 2: %.1f%nMédia: %.1f%nResultado: %s%n",
                                    alunaCadastrada.nome,
                                    alunaCadastrada.nota,
                                    alunaCadastrada.nota2,
                                    alunaCadastrada.media,
                                    resultadoAluna
                            );
                        }
                    }

                    break;
                case 3:
                    System.out.println("Até logo! Obrigada por utilizar o sistema.");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida! Digite 1, 2 ou 3.");
                    break;
            }
        }

        sc.close();
    }
}