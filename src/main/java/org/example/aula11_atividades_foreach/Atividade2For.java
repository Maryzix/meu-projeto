package org.example.aula11_atividades_foreach;

import java.util.ArrayList;
import java.util.List;

public class Atividade2For {
    public static void main(String[] args) {
       // 2. Crie um ArrayList com 5 notas e imprima todas usando for-each.
        ArrayList<Double> notas = new ArrayList<>(List.of(5.5, 2.4, 6.5, 6.1));

        for ( Double nota : notas){
            System.out.println(nota);
        }
    }
}
