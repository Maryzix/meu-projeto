package org.example.ProjetoPetShop;

public class Pet {
    String nome;
    String especie;
    double peso;

    void definirPorte(){
    if(peso < 10){
            System.out.println("\nPorte: Pequeno");
        } else if(peso >= 10 && peso <= 25){
            System.out.println("\nPorte: Médio");
        }else {
            System.out.println("\nPorte: Grande");
        }
    }
}


