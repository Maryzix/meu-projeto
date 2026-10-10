package org.example.Modulo2.atividades_heranca;

public class Aluna extends Pessoa{
    String curso;

    void estudar(){
        System.out.println(nome + " Está estudando " + curso);
    }

    void apresentar(){
        System.out.println("Oi, sou " + nome + " e estudo " + curso);
    }
}
