package org.example.aula5revisao;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*7 -  DESAFIO — Sistema de Cadastro de Alunas
        Você vai construir um programa que cadastra alunas, calcula a média delas e diz se foram aprovadas. O programa fica rodando até a pessoa escolher sair.

        Este desafio tem regras de construção obrigatórias. Não é só fazer funcionar, é fazer funcionando do jeito pedido. Sigam as instruções solicitadas, pois o objetivo é praticar as estruturas que vimos essa semana.

        O que o programa faz
        Pergunta se a pessoa quer iniciar: 1 para continuar, 2 para sair
        Se escolher 1:
        pede a primeira nota
        pede a segunda nota
        calcula a média
        pede o nome da aluna
        decide se ela foi aprovada (média 6 ou mais)
        mostra uma frase com o nome, as duas notas, a média e se foi aprovada
        volta pro menu
        Se escolher 2: mostra uma mensagem de despedida e encerra
        Se digitar qualquer outra coisa: avisa que a opção é inválida e volta pro menu */

        boolean continuar = true;

        while (continuar) {

            System.out.println();
            System.out.println("===== SISTEMA DE CADASTRO DE ALUNAS DA MARY=====");
            System.out.println("1 - Cadastrar aluna(o) e nota");
            System.out.println("2 - Sair");
            System.out.print("Digite uma opção: ");

            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    Aluna aluna = new Aluna();

                    System.out.print("Digite a primeira nota: ");
                    aluna.nota = sc.nextDouble();

                    System.out.print("Digite a segunda nota: ");
                    aluna.nota2 = sc.nextDouble();

                    aluna.media = (aluna.nota + aluna.nota2) / 2;

                    sc.nextLine();

                    System.out.print("Digite o nome da aluna: ");
                    aluna.nome = sc.nextLine();

                    if (aluna.media >= 6) {
                        aluna.passou = true;
                    } else {
                        aluna.passou = false;
                    }

                    System.out.printf(
                            "%nNome: %s%nNota 1: %.1f%nNota 2: %.1f%nMédia: %.1f%nPassou: %b%n",
                            aluna.nome,
                            aluna.nota,
                            aluna.nota2,
                            aluna.media,
                            aluna.passou
                    );
                    break;

                case 2:
                    System.out.println("Até logo! Obrigada por utilizar o sistema.");
                    continuar = false;
                    break;
                default:

                    System.out.println("Opção inválida! Digite 1 ou 2.");
                    break;
            }
        }

        sc.close();

    }
}
