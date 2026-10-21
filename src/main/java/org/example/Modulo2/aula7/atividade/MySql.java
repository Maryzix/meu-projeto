package org.example.Modulo2.aula7.atividade;

public class MySql implements BancoDeDados{

    @Override
    public boolean chamarBanco() {
        System.out.println("O Banco conectado é o MySql.");
        return false;
    }

    @Override
    public void getNumero() {

    }
}

