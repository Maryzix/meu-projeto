package org.example.aula11_atividades_foreach;

import java.util.ArrayList;
import java.util.List;

public class Atividade3For {
    public static void main(String[] args) {
        //3. Com o array de notas {8, 6, 10, 7}, use for-each para somar
        //   todas e mostrar a soma e a média.

        ArrayList<Integer> notas = new ArrayList<>(List.of(8, 6, 10, 7));

        int soma = 0;

        for ( Integer nota : notas){
            soma += nota;
        }

        int media = soma / notas.size();
        System.out.println(soma);
        System.out.println(media);

    }
}
