package org.example.atividades_aula_10.aula_hashmap;

import java.util.HashMap;

public class Atividade5 {
    public static void main(String[] args) {

       // 5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
       // Remova uma delas e imprima de novo.

        HashMap<String, Double> notas = new HashMap<>();
        notas.put("Ana", 5.50);
        notas.put("Joana", 7.50);
        notas.put("Mary", 10.00);

        System.out.println(notas.keySet());
        System.out.println(notas.size());

        notas.remove("Joana");
        System.out.println(notas.keySet());
        System.out.println(notas.size());
    }
}
