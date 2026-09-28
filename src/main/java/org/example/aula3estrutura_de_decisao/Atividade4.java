package org.example.aula3estrutura_de_decisao;

public class Atividade4 {
    public static void main(String[] args) {
        //4 — Crie variáveis idade (17) e temAutorizacao (true). Mostre se a pessoa pode entrar na festa: precisa ter 18 anos ou ter autorização. Faça o mesmo para
        //precisa ter 18 anos e ter autorização.

        int idade = 17;
        boolean temAutorizacao = true;

        // nesse o retorno é pode entrar pelo motivo de utilizar OU ( || )
        //se um é verdadeiro e outro falso, o resultado é verdadeiro
        if (idade >= 18 || temAutorizacao){
            System.out.println("Pode entrar");
        }else {
            System.out.println("Não pode entrar");
        }

        //Nesse caso o retorno é Não pode entrar, pois precisar ter um E outro.
        //Se vc não tem 18 e não tem autorização, vc não pode entrar.
        if (idade >= 18 && temAutorizacao){
            System.out.println("Pode entrar");
        } else {
            System.out.println("Não pode entrar");
        }


    }
}
