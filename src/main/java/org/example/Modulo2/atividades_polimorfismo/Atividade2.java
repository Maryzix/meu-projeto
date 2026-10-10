package org.example.Modulo2.atividades_polimorfismo;

public class Atividade2 {
    public static void main (String[] args){
        Painel painel = new Painel();

        System.out.println(painel.exibir());
        System.out.println(painel.exibir(3));
        System.out.println(painel.exibir(4.5));
        System.out.println(painel.exibir(true));
    }
}
