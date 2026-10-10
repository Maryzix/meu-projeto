package org.example.Modulo1.aula4_Repeticao_looping;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int senha = 0;

        do {
            System.out.println("Digite sua senha: ");
            senha = scanner.nextInt();
        } while(senha != 1234);


    }
}

