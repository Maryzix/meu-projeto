package org.example.Modulo1.atividades_aula_10.aula_arraydeque;

import java.util.ArrayDeque;
import java.util.List;

public class Atividade1 {
    public static void main(String[] args) {
        //1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila
        //   e quantas pessoas tem.

        ArrayDeque<String> nome = new ArrayDeque<>();
        nome.add("pessoa1");
        nome.add("pessoa2");
        nome.add("pessoa3");
        System.out.println(nome);
        System.out.println(nome.size());



    }
}
