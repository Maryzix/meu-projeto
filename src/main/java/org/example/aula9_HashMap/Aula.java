package org.example.aula9_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Aula {
    public static void main(String[] args) {

        /*..put("Ana", 28);
        .get("Ana");
        .getOrDefault("Zoe", 0);
        .containsKey("Ana");
        .containsValue(28);
        .remove("Ana");
        .size();
        .isEmpty();
        .keySet();
        .values();
        putAll(Map.of())
        */
        //começa a guardar valores mais complexos
        HashMap<String, String> emails = new HashMap<>();
        HashMap<String, Integer> idade = new HashMap<>();
        emails.put("Ane", "ane@gmail.com");
        idade.put("Ane", 10);
        emails.put("Paloma", "paloma@gmail.com");
        emails.put("posicao 2", "qualquer coisa");
        System.out.println(emails.get("Ane"));
        System.out.println(emails.get("posicao 2"));
        System.out.println(idade.get("Ane") + " " + emails.get("Ane"));
        System.out.println(emails.getOrDefault("olá", "Posição inválida"));

        HashMap<String, String> mapa = new  HashMap<>(Map.of("Maria", "maria@gmail.com", "Ana", "ana@gmail.com"));

        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();

        System.out.println(mapa.getOrDefault(nome, "Nome não encontrado."));
    }
}
