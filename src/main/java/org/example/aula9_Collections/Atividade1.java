package org.example.aula9_Collections;

import java.util.ArrayList;
import java.util.List;

public class Atividade1 {
    public static void main(String[] args) {
        // Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.

        ArrayList<String> lista = new ArrayList<>();

        lista.addAll(List.of("Mary", "Joana", "Carla"));

        System.out.println(lista);

    }
}
