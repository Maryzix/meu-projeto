package org.example.Modulo2.aula9_atividades.questao4_adapter;

public interface Pagamento {
    void pagar();

    public class PayPalAPI {
        public void sendPayment() {
            System.out.println("Pagamento enviado pelo PayPal.");
        }
    }
}
