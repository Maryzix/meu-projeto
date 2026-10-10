package org.example.Modulo2.atividades_polimorfismo;

public class Atividade1 {
    public static void main (String[] args){

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.calcularArea(5.0));
        System.out.println(calculadora.calcularArea(5.0, 6.0));
        System.out.println(calculadora.calcularArea(3.14159, 10.7, 12.1));
    }
}
