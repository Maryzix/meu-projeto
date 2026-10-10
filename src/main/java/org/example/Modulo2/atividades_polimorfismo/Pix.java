package org.example.Modulo2.atividades_polimorfismo;

public class Pix implements MeioDePagamento{

    @Override
    public void pagar(double valor) {
        System.out.printf(
                "Pagamento do Pix no valor de %.2f realizado",
                valor
        );
    }
}
