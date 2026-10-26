package org.example.Modulo2.atividade_decorator;

public class Granola extends AcaiDecorator {

    public Granola(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + " + Granola";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 2.00;
    }
}
