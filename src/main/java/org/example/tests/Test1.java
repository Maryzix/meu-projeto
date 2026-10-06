package org.example.tests;

import java.util.ArrayList;
import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {

        // 1. ARRAY
        String[] nomes = {"Ana", "Maria", "João"};

        System.out.println("Array:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // 2. ARRAYLIST
        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Morango");

        System.out.println("\nArrayList:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // 3. HASHMAP
        HashMap<String, Integer> idades = new HashMap<>();

        idades.put("Ana", 25);
        idades.put("Maria", 30);
        idades.put("João", 20);

        System.out.println("\nHashMap:");
        System.out.println("Idade da Ana: " + idades.get("Ana"));

        // 4. TRATAMENTO DE EXCEÇÃO
        try {
            int resultado = 10 / 0;
            System.out.println(resultado);

        } catch (ArithmeticException e) {
            System.out.println("\nNão é possível dividir por zero!");
        }
    }
}
