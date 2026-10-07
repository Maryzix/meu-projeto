package org.example.atividades_aula_10.aula_hashset;

import java.util.HashSet;

public class Atividade1 {
    public static void main(String[] args) {
           /*Crie um HashSet de nomes e adicione quatro valores, sendo um deles
        repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
        com o repetido.*/

        /*
        .add("Ana");
        .contains("Ana");
        123.421.039-84
        .size();
        .isEmpty();
        .clear();
        new HashSet<>(lista);
        .addAll(List.of("Ana", "Bia", "Carla"));
        */


        HashSet<String> nomes = new HashSet<>();
        nomes.add("Ana");
        nomes.add("Carla");
        nomes.add("Carol");
        nomes.add("Ana");

        System.out.println(nomes.size());
        System.out.println(nomes);

        //ele não foi adicionado e foi para o meio, na posicao 2...



    }
}
