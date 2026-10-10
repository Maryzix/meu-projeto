package org.example.Modulo1.aula6_Array;

public class Atividade2 {
    public static void main(String[] args) {
        //2 — Crie um array com as notas {8, 6, 10, 7, 9}. Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".

        int[] notas = {8, 6, 10, 7, 9};

        for (int i = 0; i < notas.length; i++) {
            System.out.println( "Nota " + (i + 1) + ": " + notas[i]);
        }
    }
}
