package org.example.Modulo1.aula8_Excecao;


import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        //1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo. Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por zero.


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int a = sc.nextInt();
        System.out.println("Digite outro número: ");
        int b = sc.nextInt();

        try{
           int resultado = a / b;
            System.out.println(resultado);
        }catch(ArithmeticException ae){
            System.out.println("Não se divide por 0");
        }
    }
}
