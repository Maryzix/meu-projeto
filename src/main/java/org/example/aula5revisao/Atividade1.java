package org.example.aula5revisao;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
         Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"
        * */

        String nomeDoLanche;
        double valorLanche;



        System.out.print("Digite o nome do lanche: ");
        nomeDoLanche = sc.nextLine();
        System.out.print("Digite o valor do lanche: ");
        valorLanche = sc.nextInt();

        if (valorLanche >= 30.0) {
            double desconto = valorLanche - 5;
            System.out.printf("Você ganhou desconto! O valor do %s agora é R$ %.2f\n" ,nomeDoLanche,desconto);
        }else {
            System.out.printf("Ah, não ganhou desconto! O valor do %s é R$ %.2f\n" , nomeDoLanche, valorLanche);
        }

    }
}
