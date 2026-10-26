package org.example.Modulo2.aula11_padroes_comportamentais.observer;

public class Seguidor implements Inscrito{
    String nome;

    public Seguidor(String nome){
        this.nome = nome;
    }

    @Override
    public void receberNotificacao(String mensagem){
        System.out.println(" [" + nome + "] recebeu o alerta: " + mensagem);
    }
}
