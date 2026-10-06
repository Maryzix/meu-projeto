package org.example.aula6_Array;

public class Atividade3 {
    public static void main(String[] args) {
        //3 — Com o mesmo array de notas, calcule e mostre a soma e a média.
        int[] notas = {8, 6, 10, 7, 9};

        int soma = 0;

        for(int i = 0; i < notas.length; i++){
           soma += notas[i];
        }
        //atribui o valor soma = resultado do for
        int media = soma / notas.length;

            System.out.println("A soma das notas é: " + soma);
            System.out.println("A média das notas é: " +media);
    }
}
