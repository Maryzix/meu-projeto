package org.example.aula9_Collections;

import java.util.ArrayList;
import java.util.List;

public class Atividade3 {
    public static void main(String[] args) {
        //- Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.

        ArrayList<String> lista = new ArrayList<>(List.of("Mary", "Joana", "Carol", "Ana"));
        System.out.println(lista);
        lista.set(2, "Maria");
        System.out.println(lista);


    }
}
