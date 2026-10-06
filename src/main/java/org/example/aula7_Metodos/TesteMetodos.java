package org.example.aula7_Metodos;

import java.util.Scanner;

import static org.example.aula7_Metodos.TesteAulaMetodo.multiplicar;
import static org.example.aula7_Metodos.Utilidades.*;

public class TesteMetodos {
    public static void main(String[] args) {
        saudar("Mary");
        dobro(5);
        calcularMedia(5.4, 6.2);
        multiplicar();


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
