package org.example.aula5_revisao.questao6;

public class NotificadorEmail implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Você recebeu um novo email! " + mensagem);
    }
}
