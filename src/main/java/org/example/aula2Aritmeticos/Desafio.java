package org.example.aula2Aritmeticos;

public class Desafio {
    public static void main(String[] args) {
        //Desafio: Crie uma variável com 3785 segundos. Mostre quantos minutos inteiros isso dá e quantos segundos sobram.

        int segundos = 3785;
        int minutos = segundos / 60;
        int segundosRestantes = segundos % 60;

        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos restantes: " + segundosRestantes);

        System.out.println("Cheatsheet");
        System.out.println("Operadores Aritméticos:  +, -, *, /, %");

    }
}
