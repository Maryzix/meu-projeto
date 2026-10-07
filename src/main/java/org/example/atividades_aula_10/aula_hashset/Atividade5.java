package org.example.atividades_aula_10.aula_hashset;

import java.util.HashSet;
import java.util.List;

public class Atividade5 {
    public static void main(String[] args) {
        /*5. Crie um HashSet com três frutas e percorra ele com for, imprimindo uma por linha.
        */
        HashSet<String> frutas = new HashSet<>(List.of("Banana", "Morango","Uva"));

//        for (int i = frutas.size(); i <= frutas.size(); i++) {
//            System.out.println(frutas);
//        }

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
