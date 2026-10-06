package org.example.aula9_Collections;

import java.util.ArrayList;
import java.util.List;

public class Atividade2 {
    public static void main(String[] args) {
        //- Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.

        ArrayList<String> lista = new ArrayList<>(List.of("Banana", "Uva", "Morango", "Melancia"));

        System.out.println(lista.get(0));
        System.out.println(lista.get(3));
        System.out.println(lista.size());



    }
}
