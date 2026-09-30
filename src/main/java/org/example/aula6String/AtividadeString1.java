package org.example.aula6String;

import java.util.Scanner;

public class AtividadeString1 {
    public static void main(String[] args) {
        //1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).
        Scanner sc = new Scanner(System.in);
        String nome;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();


        System.out.println(nome.length());

    }
}
