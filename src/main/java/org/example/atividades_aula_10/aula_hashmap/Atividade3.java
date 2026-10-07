package org.example.atividades_aula_10.aula_hashmap;

import java.lang.invoke.CallSite;
import java.util.HashMap;

public class Atividade3 {
    public static void main(String[] args) {
        // Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
        //   dentro de um if para mostrar o telefone de alguém que está na agenda
        //   e de alguém que não está.

        HashMap<String, String> agenda = new HashMap<>();
        agenda.put("Mary", "1234-5678");
        agenda.put("Carol", "5678-9876");

        if (agenda.containsKey("Mary")) {
            System.out.println("O número de Mary está aqui: " + agenda.get("Mary"));
        } else {
            System.out.println("Nenhum número encontrado");
        }

        if (agenda.containsKey("Joana")) {
            System.out.println("O número de Joana está aqui: " + agenda.get("Joana"));
        } else {
            System.out.println("Joana não está na agenda");
        }


    }
}
