package org.example.Modulo2.aula12_lambda.lambda1;

public class Main {
    public static void main(String[] args) {
        Saudacao saudacao = () -> System.out.println("Oii");
        saudacao.executar();
    }
}
