package org.example.aula6_RevisaoScanner;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        //4 - Peça um número e mostre a tabuada dele de 1 a 10.

        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("Digite o número que gostaria de ver a tabuada: ");
        numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int tabuada = i * numero;
            System.out.println("A tabuada de " +numero+ " é: " +numero+ " * " +i+ " = " + tabuada);
        }
    }
}
