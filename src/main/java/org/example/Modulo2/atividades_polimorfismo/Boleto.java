package org.example.Modulo2.atividades_polimorfismo;

public class Boleto implements MeioDePagamento{

    @Override
    public void pagar(double valor) {
        System.out.printf(
                "Pagamento do boleto no valor de %.2f realizado",
                valor
        );
    }
}
