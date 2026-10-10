package org.example.Modulo1.lista_de_revisao;

public class Variaveis {
    public static void main(String[] args) {
        /*Crie variáveis com seu nome, sua idade, sua altura e se você já programou antes. Imprima cada uma.

        Crie uma variável cidade e imprima: "Eu moro em Salvador."
        Crie primeiroNome e sobrenome e imprima o nome completo numa linha só.
        Crie uma variável preco com 29.90 e imprima o valor dela numa frase.
        Crie uma variável temCarteira com true e imprima.
*/
        String cidade = "Salvador";
        System.out.println("Eu moro em " + cidade);

        String primeiroNome = "Maria";
        String sobrenome = "Joaquina";
        System.out.println("Meu nome é " + primeiroNome + " " + sobrenome);

        double preco = 29.90;
        System.out.println("O preço do dogão é R$" + preco);

        boolean temCarteira = true;
        System.out.println(temCarteira);

        /*
         Mini-desafio — Você tem a = 10 e b = 20. Faça a = 20 e b = 10, sem escrever os números 10 e 20 de novo.
          Se você fizer a = b, o valor antigo de a se perde. Você vai precisar de uma terceira variável pra guardar alguma coisa antes.
         */

        int a = 10;
        int b = 20;

        int trocaDeValores = a; // aqui estou guardando o valor de a, que é 10
        a = b; // aqui digo que a é igual a b, nisso, esse a vira 20. a = 20
        b = trocaDeValores; // e aqui o b vira o trocaDeValores que é a variavel q eu guardei o valor antigo de a 10. b = 10

        System.out.println("valor de b: " + b);
        System.out.println("valor de a: " + a);


    }
}
