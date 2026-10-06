package org.example.aula5_revisao;


public class Atividade4 {
    public static void main(String[] args) {
    /*
    4 - Crie uma classe chamada Pet.
    Dê a ela três atributos: nome (String), raca (String) e peso (double).
    Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).
    Atribua valores para os atributos de cada um deles.
    Imprima os dados dos dois pets concatenando textos e variáveis.
     */

        Pet gato = new Pet();
        gato.nome = "Mavis";
        gato.raca = "Persa";
        gato.peso = 6;

        Pet cachorro = new Pet();
        cachorro.nome = "Buddy";
        cachorro.raca = "Golden Retriever";
        cachorro.peso = 8;

        System.out.println("O nome do gato é " + gato.nome + ", é da raça " + gato.raca + ", e pesa " + gato.peso + "kg");
        System.out.println("O nome do cachorro é " + cachorro.nome + ", é da raça " + cachorro.raca + " e pesa " + cachorro.peso +"kg");

    }
}
