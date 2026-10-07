package org.example.atividades_aula_10.aula_arraydeque;

import java.util.ArrayDeque;
import java.util.List;

public class Atividade4 {
    public static void main(String[] args) {
        //. Crie uma fila com três nomes e atenda todos usando
        //   while (!fila.isEmpty()). No final, imprima "Fila vazia!".

        ArrayDeque<String> fila = new ArrayDeque<>(List.of("Ana","Bia", "Carol"));

        while(!fila.isEmpty()){
            System.out.println(fila.poll());
        }
        System.out.println("Fila vazia");
    }
}
