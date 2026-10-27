package org.example.Modulo2.aula11_padroes_comportamentais.strategy;

public class Compra {
    private Desconto desconto;

    public Compra(Desconto desconto) {
        this.desconto = desconto;
    }

    public double calcularPrecoFinal(double valor) {
        return valor - desconto.calcularDesconto(valor);
    }
}
