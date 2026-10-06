package org.example.aula8_Excecao;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        //6 — Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe." Depois do try/catch, imprima "O programa continua funcionando."

        Scanner sc = new Scanner(System.in);

        String[] nome = {"Mary", "Joana", "Carlinha"};

        try{
            System.out.println("A nota da posição escolhida é : " + nome[5]);
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Essa posição não existe");
        }finally {
            System.out.println("O programa continua funcionando");
        }
    }
}
