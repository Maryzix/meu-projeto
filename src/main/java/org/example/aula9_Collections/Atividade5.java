package org.example.aula9_Collections;

import java.util.ArrayList;
import java.util.List;

public class Atividade5 {
    public static void main(String[] args) {
        //- Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`. (Dica: i + ": " + comando para pegar posição da lista)

        ArrayList<String> lista = new ArrayList<>(List.of("Maria", "Mary", "Joana", "Ana","Carol", "Sashimi"));
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " " + lista.get(i));
        }
    }
}
