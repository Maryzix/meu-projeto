package org.example.aula4_Repeticao_looping;

import java.util.Scanner;

public class RepeticaoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senha = 0;

        while(senha != 1234) {
            System.out.println("Digite sua senha: ");
            senha = scanner.nextInt();
        }
        System.out.println("Acesso Liberado!");
    }
}
