package org.example.aula9_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        //- Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.

        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>(List.of("Maria", "Mary", "Joana", "Ana", "Sashimi"));
        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();
        if ( lista.contains(nome)) {
            System.out.println("O nome está na lista" + " na posição "+ lista.indexOf(nome));
        } else{
            System.out.println("Esse nome não está na lista");
        }

    }
}
