package org.example.Modulo1.atividades_aula_10.aula_hashmap;

import java.util.HashMap;

public class Atividade1 {
    public static void main(String[] args) {
        //1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
        //   inteiro e depois use get para mostrar a idade de uma delas.

        HashMap<String, Integer> nome = new HashMap<>();
        nome.put("Mary", 26);
        nome.put("Ana", 21);
        nome.put("Carol", 20);

        System.out.println(nome);
        System.out.println(nome.get("Carol"));


    }
}
