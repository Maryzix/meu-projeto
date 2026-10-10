package org.example.Modulo1.aula5_revisao;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
    /*
    3 - Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
    1 - Ver camisas
    2 - Ver calças
    3 - Sair
    Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha. Se digitar uma opção inválida, avise. O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.
    * */
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo(a) a nossa loja!");

        int opcao;

        do{
            System.out.print("Escolha uma opção: \n 1 - Para ver camisas  \n 2 - Para ver calças  \n 3 - Sair \n");
             opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Ver Camisas \n");
                    System.out.println("Camisa bege R$20.00");
                    System.out.println("Camisa amarela R$30.00");
                    System.out.println("Camisa azul R$25.00");
                    System.out.println("Camisa branca R$37.00");
                    System.out.println("Camisa rosa R$28.00");
                    break;
                case 2:
                    System.out.print("Ver Calças \n");
                    System.out.println("Calça bege R$20.00");
                    System.out.println("Calça amarela R$30.00");
                    System.out.println("Calça azul R$25.00");
                    System.out.println("Calça branca R$37.00");
                    System.out.println("Calça rosa R$28.00");
                    break;
                case 3:
                    System.out.print("Sair");
                    break;
                default:
                    System.out.println("Opção inválida \n");
            }
        } while (opcao != 3);
    }
}

