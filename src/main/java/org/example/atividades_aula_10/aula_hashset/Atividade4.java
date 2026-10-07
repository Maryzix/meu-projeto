package org.example.atividades_aula_10.aula_hashset;

import java.util.HashSet;
import java.util.List;

public class Atividade4 {
    public static void main(String[] args) {
        /*
        4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e
        imprima de novo, junto com o tamanho.
        */

        HashSet<String> cpf = new HashSet<>(List.of("123.421.039-84", "123.421.129-84", "123.421.654-84"));
        System.out.println(cpf);
        cpf.remove("123.421.039-84");
        System.out.println(cpf);
        System.out.println(cpf.size());


    }
}
