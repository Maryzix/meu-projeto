package org.example.aula3estrutura_de_decisao;

public class Atividade2 {
    public static void main(String[] args) {
        //2 — Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00). Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante. Se não for, mostre "Saldo insuficiente" e quanto está faltando.

        double saldoConta = 500;
        double valorCompra = 320;

        if (saldoConta >= valorCompra) {
            System.out.println("Compra Aprovada! Saldo atual: R$"
                    + (saldoConta - valorCompra));
        }else{
            System.out.println("Saldo insuficiente: R$"
                    + (saldoConta) + (" Falta: R$") + (valorCompra - saldoConta));
        }
    }
}

