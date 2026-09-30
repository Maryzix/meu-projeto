package org.example.aula6revisaoScanner;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        //2 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.

        Scanner sc = new Scanner(System.in);

        int numero;
        int numero2;
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        System.out.println("Digite outro número: ");
        numero2 = sc.nextInt();

        System.out.println("A soma dos números é: " + (numero + numero2));
        System.out.println("A subtração dos números é: " + (numero - numero2));
        System.out.println("A multiplicação dos numeros é: " + (numero * numero2));
        System.out.println("A divisão dos numeros é: " + (numero / numero2));
        System.out.println("O resto dos numeros é: " + (numero % numero2));
    }
}
