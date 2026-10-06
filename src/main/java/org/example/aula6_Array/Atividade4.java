package org.example.aula6_Array;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        //4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.

        Scanner sc = new Scanner(System.in);

        int[] numero = new int [5];

        for(int i = 0; i <= 4; i++){
            System.out.print("Digite um numero: ");
            numero[i] = sc.nextInt(); // cada numero tem q ir na posição i
        }

        System.out.print(numero[4] + " " + numero[3] + " " + numero[2] + " " + numero[1] + " " + numero[0]);

    }
}
