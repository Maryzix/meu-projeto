package org.example.lista_de_revisao;

public class Operadores {
    public static void main(String[] args) {
        /*
        Crie a = 15 e b = 4. Imprima a soma, a subtração, a multiplicação, a divisão e o resto.

        Crie saldo = 1000. Use += para somar 250 e -= para tirar 380. Imprima o saldo final.

        Crie a = 10 e b = 10. Imprima o resultado de a == b, a != b, a > b e a >= b.

        Crie idade = 20 e temCarteira = true. Imprima o resultado de idade >= 18 && temCarteira.

        Crie um número e imprima o resto da divisão dele por 2.

        Calcule e imprima o total de uma compra: 3 pacotes de arroz a R$ 5.50 cada.
        */

        int a = 15;
        int b = 4;
        System.out.println("soma: " + (a + b));
        System.out.println("subtração: " + (a - b));
        System.out.println("multiplicação: " + (a * b));
        System.out.println("divisão: " + ( a / b));
        System.out.println("resto: " + (a % b));

        int saldo = 1000;
        saldo += 250;
        saldo -= 380;
        System.out.println(saldo);

        int c = 10;
        int d = 10;
        System.out.println(c == d);
        System.out.println(c != d);
        System.out.println(c > d);
        System.out.println(c >= d);

        int idade = 20;
        boolean temCarteira = true;

        if (idade >= 18 && temCarteira){
            System.out.println("Pode dirigir");
        } else{
            System.out.println("Não pode, no no ");
        }

        int numero = 5;
        int resultado = numero % 2;
        System.out.println(resultado);

        double compra = 5.50;
        double totalCompras = 3 * 5.50;
        System.out.println("Total da compra: " + totalCompras);

        /*
        Mini-desafio — Crie uma variável com um número qualquer e, sem usar if, imprima true ou false para a pergunta: esse número é divisível por 3 e por 5 ao mesmo tempo?
        Uma comparação já produz true ou false sozinha — não precisa de if pra isso. E um número é divisível por outro quando o resto da divisão é zero.
         */

        int numeroQualquer = 15;
        System.out.println("Esse número é divisível por 3 e por 5 ao mesmo tempo?" );
        System.out.println(numeroQualquer % 3 == 0 && numeroQualquer % 5 == 0); //foi um desafio mesmo, tive que pesquisar para tentar entender o que fazer sem o if hahaha
    }
}
