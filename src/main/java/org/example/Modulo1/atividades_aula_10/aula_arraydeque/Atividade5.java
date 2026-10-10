package org.example.Modulo1.atividades_aula_10.aula_arraydeque;

import java.util.ArrayDeque;
import java.util.List;

public class Atividade5 {
    public static void main(String[] args) {
        //5. Crie uma fila com três nomes e use contains para responder duas
        //   perguntas: se "Bia" está na fila e se "Zoe" está.

        ArrayDeque<String> fila = new ArrayDeque<>(List.of("Ana","Bia", "Carol"));

        System.out.println("A Bia está na fila?");

        if ((fila.contains("Bia"))){
            System.out.println("Essa fila tem uma Bia");
        } else {
            System.out.println("Nenhuma Bia por aqui");
        }

        System.out.println("A Zoe está na fila?");
        if ((fila.contains("Zoe"))){
            System.out.println("Essa fila tem uma Zoe");
        } else {
            System.out.println("Nenhuma Zoe por aqui");
        }
//        System.out.println(fila.contains("Bia"));
//        System.out.println("E a zoe, ela está na fila?");
//        System.out.println(fila.contains("Zoe"));
        // da para fazer assim tbm para true or false
    }
}
