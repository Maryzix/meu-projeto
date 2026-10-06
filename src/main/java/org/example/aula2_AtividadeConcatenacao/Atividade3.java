package org.example.aula2_AtividadeConcatenacao;

public class Atividade3 {
    public static void main(String[] args) {
        //3- Crie duas variáveis com números inteiros. Mostre a soma em uma frase completa, assim:
        // "A soma de 15 e 4 é igual a 19."

        int numero1 = 15;
        int numero2 = 4;
        int soma = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + soma);
        // ou
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + (numero1 + numero2));

    }
}
