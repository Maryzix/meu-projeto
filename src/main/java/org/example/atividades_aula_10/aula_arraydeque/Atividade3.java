package org.example.atividades_aula_10.aula_arraydeque;

import java.util.ArrayDeque;
import java.util.List;

public class Atividade3 {
    public static void main(String[] args) {
        //3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila
        //   depois. Compare com o exercício 2.

        //2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
        //   imprima a fila logo depois. Repare que ela não mudou.
        ArrayDeque<String> nome = new ArrayDeque<>();
        nome.addAll(List.of("Ana","Bia"));
        System.out.println(nome.peek());
        System.out.println(nome);
        System.out.println(nome.poll());
        System.out.println(nome);
    }
}
