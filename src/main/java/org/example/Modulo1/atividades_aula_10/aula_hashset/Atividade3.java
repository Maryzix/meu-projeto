package org.example.Modulo1.atividades_aula_10.aula_hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Atividade3 {
    public static void main(String[] args) {
        /*3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
   tirar os repetidos. Imprima os dois e compare.*/

        ArrayList<String> nome = new ArrayList<>(List.of("Ana", "Carol", "Ana", "Carol"));
        HashSet<String> lista = new HashSet<>(nome);

        System.out.println(nome);
        System.out.println(lista);

    }
}
