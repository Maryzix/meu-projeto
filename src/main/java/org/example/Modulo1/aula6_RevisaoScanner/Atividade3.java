package org.example.Modulo1.aula6_RevisaoScanner;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        //3 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais), ficou de recuperação (entre 5 e 6.9) ou foi reprovada.

        double nota;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua nota: ");
        nota = sc.nextDouble();

        if (nota > 7){
            System.out.println("Parabéns, você foi aprovada! ");
        } else if (nota >= 5 && nota <= 6.9) {
            System.out.println("Calma! Você ainda pode recuperar, você está em recuperação! ");
        } else {
            System.out.println("Fim da linha, parça, reprovou!");
        }

    }

}
