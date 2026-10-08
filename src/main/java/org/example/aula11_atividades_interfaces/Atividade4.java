package org.example.aula11_atividades_interfaces;

import java.util.ArrayList;

public class Atividade4 {
    public static void main(String[] args) {
        //4. Crie uma interface Notificacao com o metodo enviar(String mensagem).
        //   Crie duas classes que implementam ela: Email e SMS. Cada uma
        //   imprime de um jeito. Adicione as duas num ArrayList<Notificacao>
        //   e percorra com for-each, enviando a mesma mensagem.
        //
        //   Saída esperada:
        //   E-mail enviado: Sua compra foi aprovada!
        //   SMS enviado: Sua compra foi aprovada!
        ArrayList<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(new SMS());
        notificacoes.add(new Email());
        SMS sms = new SMS();
        Email email = new Email();

        for ( Notificacao notificacao : notificacoes){
            notificacao.enviar();
        }
    }
}
