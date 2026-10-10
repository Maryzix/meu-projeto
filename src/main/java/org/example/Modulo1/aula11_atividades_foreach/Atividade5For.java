package org.example.Modulo1.aula11_atividades_foreach;

public class Atividade5For {
    public static void main(String[] args) {
        //5. Pegue o exercício 1 e escreva ele DE NOVO com o for normal,
        //   usando o índice. Deixe os dois na mesma classe e compare.
        String [] nome = {"Mary", "Joana", "Carla", "Carol"};

        for (int i = 0; i < nome.length; i++) {
            System.out.println(nome[i]);
        }
        for (String nomes : nome){
            System.out.println(nomes);
        }
    }
}
