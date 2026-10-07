package org.example.atividades_aula_10.aula_hashset;

import java.util.HashSet;
import java.util.List;

public class Atividade2 {
    public static void main(String[] args) {
        /*Crie um HashSet de cores usando addAll. Depois use contains dentro
          de um if para avisar se a cor "verde" já está no conjunto ou não.*/

        HashSet<String> cores = new HashSet<>(List.of("Azul", "Amarelo", "Verde", "Rosa"));

        if (cores.contains("Verde")){
            System.out.println("Contém verde");
        }else{
            System.out.println("nao tem");
        }
    }
}
