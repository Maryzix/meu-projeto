package org.example.Modulo1.aula7_Metodos;

import static org.example.Modulo1.aula7_Metodos.Utilidades.somar;

public class Atividade6 {
    public static void main(String[] args) {
        //6 — Crie três métodos com o mesmo nome somar:
        //um que recebe dois inteiros
        //um que recebe três inteiros
        //um que recebe dois decimais
        //No main, chame os três e veja o Java escolher sozinho qual usar.

        System.out.println(somar(1.8,3.2));
        System.out.println(somar(1, 3));
        System.out.println(somar(1,3,7));

    }
}
