package org.example.Modulo2.aula7.builder;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .borda("Catupiry")
                .sabor("Mussarela")
                .temQueijo(true)
                .build();

    }
}
