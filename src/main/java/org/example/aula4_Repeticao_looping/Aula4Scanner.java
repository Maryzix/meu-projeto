package org.example.aula4_Repeticao_looping;

import java.util.Scanner;

public class Aula4Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Seu nome é:  "+ nome);
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Sua idade é: " + idade);

        /* erro comum em String
        *System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Seu nome é:  "+ nome);
        * */
    }
}
