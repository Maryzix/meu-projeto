package org.example.Modulo2.aula9_atividades.questao3_factory;

public class AnimalFactory {
//    Crie a classe AnimalFactory com um metodo getAnimal(String tipo):
//    • se o tipo for "cachorro", devolve um Cachorro;
//    • se o tipo for "gato", devolve um Gato.

    public static Animal getAnimal(String tipo){
       if (tipo.equalsIgnoreCase("Cachorro")){
           return new Cachorro();
       }else if (tipo.equalsIgnoreCase( "Gato")){
           return new Gato();
       }else{
          return null;
       }
    }
}
