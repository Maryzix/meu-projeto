package org.example.aula6_String;

import java.util.Scanner;

public class AtividadeString5 {
    public static void main(String[] args) {
        //5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.
        //Digite seu nome: Ana
        //Digite de novo: ANA
        //Os nomes são iguais? true

        Scanner sc = new Scanner(System.in);
        String nomeMinusculo;
        String nomeMaiusculo;

        System.out.println("Digite seu nome em minusculo: ");
        nomeMinusculo = sc.nextLine();
        System.out.println("Digite seu nome em maiusculo: ");
        nomeMaiusculo = sc.nextLine();

        System.out.println(nomeMaiusculo.equalsIgnoreCase (nomeMinusculo));




    }
}
