package org.example.Modulo2.aula5_revisao.questao6;

public class FolhaDePagamento {

    private final Notificador notificador;

    public FolhaDePagamento(Notificador notificador) {
        this.notificador = notificador;
    }

    public void pagar(Funcionario f) {
        double salario = f.calcularSalario();

        String mensagem = "Olá, " + f.getNome()
                + "! Seu salário é R$ " + salario;

        notificador.notificar(mensagem);
    }
}