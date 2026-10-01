package org.example.aula7Metodos;

import java.util.Scanner;

public class Utilidades {

    //2 — Crie um metodo saudar(String nome) que imprime "Olá, [nome]! Tudo bem?". Chame ele três vezes, passando nomes diferentes.
    static void saudar(String nome){
        System.out.println("Olá " + nome + "!");
    }

    //3 — Crie um metodo dobro(int numero) que devolve o dobro do número recebido. No main, chame ele e mostre o resultado.
    static void dobro(int numero){
        numero = numero * 2;
        System.out.println(numero);
    }

    //4 — Crie um metodo calcularMedia(double n1, double n2) que devolve a média das duas notas. No main, peça as duas notas com Scanner e mostre a média com duas casas decimais.
    static void calcularMedia(double n1, double n2){
        double media = (n1 + n2) / 2;
        System.out.println(media);
    }

    //5 — Crie um metodo ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade e use o retorno do metodo dentro de um if para imprimir se a pessoa é maior ou menor de idade.

    static boolean ehMaiorDeIdade (int idade){
        if (idade < 18){
            return false;
        } else {
            return true;
        }
    }

    //6 — Crie três métodos com o mesmo nome somar:
    //um que recebe dois inteiros
    //um que recebe três inteiros
    //um que recebe dois decimais
    //No main, chame os três e veja o Java escolher sozinho qual usar.

    static int somar(int a, int b){
        return a + b;
    }
    static int somar(int a, int b, int c){
        return a + b + c;
    }
    static double somar(double a, double b){
        return a + b;
    }

    //7 — Crie dois métodos chamados saudacao:
    //um sem parâmetro, que imprime "Olá!"
    //um que recebe um nome, e imprime "Olá, [nome]!"

    static void saudacao(String nome){
        System.out.println("Olá! " + nome);
    }

    static void saudacao(){
        System.out.println("Olá! ");
    }

}
