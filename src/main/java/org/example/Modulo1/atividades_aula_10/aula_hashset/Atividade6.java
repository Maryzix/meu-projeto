package org.example.Modulo1.atividades_aula_10.aula_hashset;

import java.util.HashSet;

public class Atividade6 {
    public static void main(String[] args) {
        //6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
        //   imprima o isEmpty() de novo.

        HashSet<String> vazio = new HashSet<>();
        System.out.println(vazio.isEmpty());
        vazio.add("Cheio");
        System.out.println(vazio.isEmpty());

    }
}
