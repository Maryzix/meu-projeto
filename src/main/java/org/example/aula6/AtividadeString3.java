package org.example.aula6;

import java.util.Scanner;

public class AtividadeString3 {
    public static void main(String[] args) {
        //3 — Peça o nome da pessoa e mostre a primeira letra dele.

        Scanner sc = new Scanner(System.in);
        String nome;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println(nome.charAt(0));

    }
}
