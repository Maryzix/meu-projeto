package org.example.Modulo2.atividades_heranca;

public class Atividade1 {
    public static void main(String[] args){
        //1. Crie a classe Pessoa com os atributos nome e idade, e o metodo
        //   apresentar(), que imprime "Oi, sou [nome] e tenho [idade] anos."
        //
        //   Crie a classe Aluna que SÓ faz extends Pessoa, sem acrescentar nada.
        //
        //   Na Main, crie uma aluna, preencha nome e idade, e chame apresentar().
        //
        //   Repare: você não escreveu nome, idade nem apresentar() na Aluna,
        //   e os três funcionaram.

        Aluna mary = new Aluna();
        mary.nome = "Mary";
        mary.idade = 26;

        mary.apresentar();
    }
}
