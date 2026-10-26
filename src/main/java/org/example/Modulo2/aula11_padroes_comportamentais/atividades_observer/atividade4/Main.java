package org.example.Modulo2.aula11_padroes_comportamentais.atividades_observer.atividade4;

public class Main {
    public static void main(String[] args) {

        Voo voo = new Voo();

        Passageiro passageiro = new Passageiro("Mary");

        voo.adicionarObservador(passageiro);

        voo.mudarStatus("Embarque iniciado");
    }
}