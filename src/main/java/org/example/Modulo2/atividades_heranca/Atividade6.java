package org.example.Modulo2.atividades_heranca;

public class Atividade6 {
    public static void main (String [] args){
        Gerente gerente = new Gerente();
        gerente.nome = "Carol";

        gerente.baterPonto();
        gerente.aprovarFerias("Ana");
        gerente.notificar("Aprovado!");
        gerente.exportar();


    }
}
