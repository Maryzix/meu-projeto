package org.example.Modulo2.aula9_atividades.questao4_adapter;

public class Main {
    public static void main(String[] args) {

        // Esta linha não compila, pois PayPalAPI não implementa Pagamento:
        // Pagamento pagamento = new PayPalAPI();

        Pagamento pagamento = new PayPalAdapter(new Pagamento.PayPalAPI());

        pagamento.pagar();
    }
}