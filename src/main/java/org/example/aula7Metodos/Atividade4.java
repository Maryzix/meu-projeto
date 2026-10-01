package org.example.aula7Metodos;

import java.util.Scanner;

import static org.example.aula7Metodos.Utilidades.calcularMedia;

public class Atividade4 {
    public static void main(String[] args) {
        //4 — Crie um metodo calcularMedia(double n1, double n2) que devolve a média das duas notas. No main, peça as duas notas com Scanner e mostre a média com duas casas decimais.

        Scanner sc = new Scanner(System.in);
        double nota;
        double nota2;
        System.out.printf("Digite uma nota: ");
        nota = sc.nextDouble();
        System.out.printf("Digite outra nota: ");
        nota2 = sc.nextDouble();

        calcularMedia(nota, nota2);

    }
}
