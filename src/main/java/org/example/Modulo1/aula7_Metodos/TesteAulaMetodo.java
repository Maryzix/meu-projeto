package org.example.Modulo1.aula7_Metodos;

import java.util.Scanner;

public class TesteAulaMetodo {

    static void saudar(){
        System.out.println("Olá");
    }

    static void scannerNome(){
        String nome;
        Scanner sc = new Scanner(System.in);
        nome = sc.nextLine();;
        System.out.println("Olá! " + nome);
    }

    static int soma(int a, int b){
        return a + b;
    }

    static void multiplicar(){

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
