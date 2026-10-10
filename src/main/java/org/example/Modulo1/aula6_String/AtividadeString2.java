package org.example.Modulo1.aula6_String;

import java.util.Scanner;

public class AtividadeString2 {
    public static void main(String[] args) {
        //2 — Peça o nome da pessoa e mostre ele lowercase uppercase.
        Scanner sc = new Scanner(System.in);
        String nome;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());

    }
}
