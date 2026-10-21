package org.example.Modulo2.aula7.atividade;

public class Main {

    public static void conectarBanco(BancoDeDados banco) {
        banco.chamarBanco();
        banco.getNumero();
    }

    public static void main(String[] args) {
        BancoDeDados mysql = new MySql();
        BancoDeDados oracle = new Oracle();

        conectarBanco(mysql);
        conectarBanco(oracle);
    }
}
