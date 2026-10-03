package org.example.aula8Excecao;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        //5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número. Trate a ArithmeticException para o caso de ela digitar 0.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");

        try{
            int a = sc.nextInt();
            int resultado = 100 % a;
            System.out.println("Resultado é: "+ resultado);
        }catch(ArithmeticException ae){
            System.out.println("Não se divide por 0");
        }
    }
}
