package org.example.aula11_atividades_foreach;

public class Atividade1For {
    public static void main(String[] args) {
        //1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each,
        //   um por linha.
        String [] nome = {"Mary", "Joana", "Carla", "Carol"};

        for (String nomes : nome){
            System.out.println(nomes);
        };
    }
}
