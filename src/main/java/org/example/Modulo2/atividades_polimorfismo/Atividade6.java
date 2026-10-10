package org.example.Modulo2.atividades_polimorfismo;

public class Atividade6 {
    public static void main (String[] args) {

        MeioDePagamento forma;

        forma = new Pix();
        forma.pagar(150.00);

        forma = new Boleto();
        forma.pagar(150.00);
    }
}
