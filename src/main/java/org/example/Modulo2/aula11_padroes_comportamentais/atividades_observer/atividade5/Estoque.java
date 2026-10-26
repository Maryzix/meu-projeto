package org.example.Modulo2.aula11_padroes_comportamentais.atividades_observer.atividade5;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<ObservadorEstoque> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorEstoque o){
        observadores.add(o);
    }

    public void setQuantidade(int quantidade){
        for(ObservadorEstoque observador: observadores){
            observador.atualizar(quantidade);
        }
    }
}
