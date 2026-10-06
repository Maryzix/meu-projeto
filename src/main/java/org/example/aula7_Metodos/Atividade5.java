package org.example.aula7_Metodos;

import java.util.Scanner;

import static org.example.aula7_Metodos.Utilidades.ehMaiorDeIdade;

public class Atividade5 {
    public static void main(String[] args) {
        //    //5 — Crie um metodo ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade e use o retorno do metodo dentro de um if para imprimir se a pessoa é maior ou menor de idade.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if(ehMaiorDeIdade(idade)){
            System.out.println("é maior de idade");
        }else{
            System.out.println("É menor de idade");
        }
    }
}
