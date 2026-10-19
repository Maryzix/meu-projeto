package org.example.Modulo2.aula5_Singleton;

public class Atividade1 {
    private static Atividade1 instancia;

    private Atividade1(){

    }

    //boas praticas, testar se a instancia esta nula
    public static Atividade1 getInstancia(){
        if(instancia == null){
            instancia = new Atividade1();
        }
        return instancia;
    }
}
