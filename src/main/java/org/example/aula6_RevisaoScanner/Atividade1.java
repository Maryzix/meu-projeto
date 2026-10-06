package org.example.aula6_RevisaoScanner;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        //1 - Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."

        String nome;
        int idade;
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Olá, " + nome + ", você tem " + idade + " anos e ano que vem, voce fará "+ (idade+1) + " anos");
    }
}
