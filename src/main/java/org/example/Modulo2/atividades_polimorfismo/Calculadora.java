package org.example.Modulo2.atividades_polimorfismo;

public class Calculadora {

    public double calcularArea(double lado) {
        return lado * lado;
    }

    public double calcularArea(double base, double altura){
        return base * altura;
    }

    public double calcularArea(double pi, double raio0, double raio){
        return pi * raio0 * raio;
    }
}
