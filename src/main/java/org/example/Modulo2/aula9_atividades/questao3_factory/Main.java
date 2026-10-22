package org.example.Modulo2.aula9_atividades.questao3_factory;

public class Main {
    public static void main(String[] args) {
        //Notificador n = NotificadorFactory.criar("SMS");
        Animal cachorro = AnimalFactory.getAnimal("Cachorro");
        Animal gato = AnimalFactory.getAnimal("Gato");

        gato.emitirSom();
        cachorro.emitirSom();
    }
}
