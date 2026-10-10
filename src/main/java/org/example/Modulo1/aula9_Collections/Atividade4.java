package org.example.Modulo1.aula9_Collections;

import java.util.ArrayList;
import java.util.List;

public class Atividade4 {
    public static void main(String[] args) {
        //- Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.

        ArrayList<String> lista = new ArrayList<>(List.of("Porto Alegre", "Imbé", "Tramandaí", "Esteio"));
        System.out.println(lista);
        lista.remove(1);
        System.out.println(lista);
    }
}
