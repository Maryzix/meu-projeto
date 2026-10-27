package org.example.Modulo2.aula11_padroes_comportamentais.strategy;

public class SemDesconto implements Desconto {
    @Override
    public double calcularDesconto(double valor) {

        return 0;
    }
}
