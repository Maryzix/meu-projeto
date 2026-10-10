package org.example.Modulo1.atividades_aula_10.aula_arraydeque;

import java.util.ArrayDeque;
import java.util.List;

import static java.util.Collections.addAll;

public class Atividade2 {
    public static void main(String[] args) {
        //2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
        //   imprima a fila logo depois. Repare que ela não mudou.
        ArrayDeque<String> nome = new ArrayDeque<>();
        nome.addAll(List.of("Ana","Bia"));
        System.out.println(nome.peek());
        System.out.println(nome);
    }
}
