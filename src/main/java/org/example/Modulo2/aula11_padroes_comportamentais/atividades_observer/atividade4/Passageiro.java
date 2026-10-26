package org.example.Modulo2.aula11_padroes_comportamentais.atividades_observer.atividade4;

public class Passageiro implements ObservadorVoo{
    //a) Crie uma classe Passageiro que implementa ObservadorVoo e, no atualizar, imprime "Passageiro avisado: " + o status.

    String passageiro;
    public Passageiro (String passageiro){
        this.passageiro = passageiro;
    }

    @Override
    public void atualizar(String status){
        System.out.println(" [" + passageiro + "] avisado: " + status);
    }
}
