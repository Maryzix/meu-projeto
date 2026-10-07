package org.example.atividades_aula_10.aula_arraydeque;

import java.util.ArrayDeque;

public class Atividade6 {
    public static void main(String[] args) {
//        6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
//        - se estiver vazia  -> "Não tem ninguém na fila."
//                - se tiver gente    -> "Próximo: [nome]"
//        Depois adicione uma pessoa e teste de novo.
        ArrayDeque<String> fila = new ArrayDeque<>();

        if (fila.isEmpty()){
            System.out.println("Fila Vazia!");
        }else {
            System.out.println("Próximo: " + fila.poll());
        }

        fila.add("Joana");
        fila.add("Carla");
        fila.add("Ana");
        fila.add("Carolina");

        if (fila.isEmpty()){
            System.out.println("Fila Vazia!");
        }else {
            System.out.println("Próximo: " + fila.poll());
        }

    }
}
