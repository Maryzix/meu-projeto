package org.example.ProjetoPetShop;

public class Pet {
    String nome;
    String especie;
    double peso;

    String definirPorte(){
    if(peso < 10){
            return ("Pequeno");
        } else if(peso >= 10 && peso <= 25){
            return("Médio");
        }else {
            return("Grande");
        }
    }
}


