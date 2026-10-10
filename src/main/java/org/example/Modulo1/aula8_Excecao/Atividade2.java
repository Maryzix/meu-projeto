package org.example.Modulo1.aula8_Excecao;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        //2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição. Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.
        Scanner sc = new Scanner(System.in);

        int[] notas = {1, 2, 3, 4, 5};

        System.out.println("Digite uma posição: ");
        int posicao = sc.nextInt();

        try{
            System.out.println("A nota da posição escolhida é : " + notas[posicao]);
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Essa posição não existe");
        }
    }
}