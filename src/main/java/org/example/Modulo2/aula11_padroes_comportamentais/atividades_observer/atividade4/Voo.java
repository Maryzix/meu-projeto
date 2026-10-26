package org.example.Modulo2.aula11_padroes_comportamentais.atividades_observer.atividade4;

import java.util.ArrayList;

public class Voo {

    private ArrayList<ObservadorVoo> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorVoo o) {
        observadores.add(o);
    }

    public void mudarStatus(String status) {
        for (ObservadorVoo observador : observadores) {
            observador.atualizar(status);
        }
    }
}