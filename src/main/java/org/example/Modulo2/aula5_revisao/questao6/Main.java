package org.example.Modulo2.aula5_revisao.questao6;

public class Main {
    public static void main(String[] args) {

        Desenvolvedor dev = new Desenvolvedor("Ana", 4000);
        Gerente gerente = new Gerente("Carlos", 4000);


        FolhaDePagamento folhaEmail =
                new FolhaDePagamento(new NotificadorEmail());

        folhaEmail.pagar(dev);
        folhaEmail.pagar(gerente);

        // Folha de pagamento com notificação por SMS
        FolhaDePagamento folhaSms =
                new FolhaDePagamento(new NotificadorSms());

        folhaSms.pagar(dev);
        folhaSms.pagar(gerente);
    }
}