package org.example.Modulo2.aula7.atividade;

public class Oracle implements BancoDeDados{

    @Override
    public boolean chamarBanco() {
        System.out.println("O Banco conectado é o Oracle.");
        return false;
    }

    @Override
    public void getNumero() {
        System.out.println("pegay o numero");
    }
}
