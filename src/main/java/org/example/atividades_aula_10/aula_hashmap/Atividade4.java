package org.example.atividades_aula_10.aula_hashmap;

import java.util.HashMap;

public class Atividade4 {
    public static void main(String[] args) {
        //4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
        //   Use getOrDefault para mostrar a quantidade de um produto que existe
        //   e de um que não existe (devolvendo 0). Depois tente com get normal
        //   no que não existe e compare.

        HashMap<String, Integer> estoque = new HashMap<>();
        estoque.put("Controle Remoto", 10);
        estoque.put("Kindle", 20);

        System.out.println(estoque.getOrDefault("Controle Remoto", 0));
        System.out.println(estoque.getOrDefault("Casa", 0));
        System.out.println(estoque.get("Casa"));
    }
}
