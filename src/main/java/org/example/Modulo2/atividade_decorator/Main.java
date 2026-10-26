package org.example.Modulo2.atividade_decorator;

public class Main {
    public static void main(String[] args) {
        //Crie um açaí só com granola e imprima a descrição e o preço.
        //Crie um açaí com granola e morango (um adicional embrulhando o outro) e imprima a descrição e o preço.

        // Açaí simples com granola
        Acai acaiGranola = new Granola(new AcaiSimples());

        System.out.println(acaiGranola.getDescricao());
        System.out.printf("Preço: R$ %.2f%n", acaiGranola.getPreco());

        System.out.println();

        // Açaí com granola e morango
        Acai acaiGranolaMorango =
                new Morango(new Granola(new AcaiSimples()));

        System.out.println(acaiGranolaMorango.getDescricao());
        System.out.printf("Preço: R$ %.2f%n", acaiGranolaMorango.getPreco());
    }
}
