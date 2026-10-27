package org.example.Modulo2.aula11_padroes_comportamentais.strategy;


public class DescontoEstudante implements Desconto {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.10;
    }
}
