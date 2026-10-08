package org.example.aula11_atividades_interfaces;

public class Email implements Notificacao {
    @Override
    public void enviar() {
        System.out.println(" E-mail enviado: Sua compra foi aprovada!");
    }
}
