package org.example.Modulo1.aula8_Excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        //3 — Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número, trate a InputMismatchException e mostre uma mensagem pedindo um número.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade");

        try{
            int idade = sc.nextInt();
            System.out.println("Sua idade é: "+ idade);
        }catch(InputMismatchException ae){
            System.out.println("Por favor, digite um número");
        }
    }
}
