package org.example.Modulo2.aula9_atividades.questao4_adapter;

public class PayPalAdapter implements Pagamento {

    private PayPalAPI payPalAPI;

    public PayPalAdapter(PayPalAPI payPalAPI) {
        this.payPalAPI = payPalAPI;
    }

    @Override
    public void pagar() {
        payPalAPI.sendPayment();
    }
}
