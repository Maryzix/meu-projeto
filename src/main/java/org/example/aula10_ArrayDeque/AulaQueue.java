package org.example.aula10_ArrayDeque;

import java.util.ArrayDeque;
import java.util.List;

public class AulaQueue {
    public static void main(String[] args) {
       /*
        .add("Ana"); adiciona um valor
        .peek(); ve o primeiro elemento da fila
        .poll();  manda embora o elemento
        .isEmpty(); ver se a fila está vazia
        .size();  ver o tamanho da fila
        .contains("Bia");  ver se contém esse valor no array
        .addAll(List.of("Ana","Bia"));
        */



        ArrayDeque<String> fila = new ArrayDeque<>();
        // boas praticas é fazer if com checagens
        //sempre que usar um array deque deve fazer checagem para ver se está vazio

        //array list consigo accessar qualquer valor a qualquer momento
        // no array deque nao , só adiciona no final

        //se retornar vazio da erro
      /*  if ((fila.isEmpty() != true)) {
            sout adicione valores
        } else{}
        */
        fila.add("Ana");
        fila.add("Carla");
        fila.addAll(List.of("Maria", "Natalia", "Joana"));
        System.out.println(fila);
        System.out.println(fila.peek());
        System.out.println(fila.poll());
        System.out.println(fila);
        fila.poll();
        System.out.println(fila);

    }
}
