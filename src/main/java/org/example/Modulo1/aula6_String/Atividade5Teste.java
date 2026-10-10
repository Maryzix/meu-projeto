package org.example.Modulo1.aula6_String;

import java.util.Scanner;

public class Atividade5Teste {
    public static void main(String[] args) {
        //5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.
        //Digite seu nome: Ana
        //Digite de novo: ANA
        //Os nomes são iguais? true

        Scanner sc = new Scanner(System.in);
        String nomeMinusculo;
        String nomeMaiusculo;

        System.out.println("Digite seu nome minusculo: ");
        nomeMinusculo = sc.nextLine();
        System.out.println("Digite seu nome maiusculo: ");
        nomeMaiusculo = sc.nextLine();

        System.out.println(nomeMinusculo.equalsIgnoreCase(nomeMaiusculo));


        // NOME é igual (ignora se ele ta com caps ou nao) a nome ?
                            //equalIgnoreCase
        // NOME é igual a nome? (equal) não

    }
}
