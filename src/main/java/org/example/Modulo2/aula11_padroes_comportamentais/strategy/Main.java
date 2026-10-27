package org.example.Modulo2.aula11_padroes_comportamentais.strategy;

public class Main {
    public static void main(String[] args) {

        Compra compra = new Compra(new DescontoEstudante());
        Compra compra1 = new Compra(new DescontoAniver());

        System.out.println(compra.calcularPrecoFinal(100));
        // 90.0


        compra = new Compra(new DescontoVip());

        System.out.println(compra.calcularPrecoFinal(100));
        // 80.0
    }
}
