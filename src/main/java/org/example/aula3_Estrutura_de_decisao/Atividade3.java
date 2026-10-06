package org.example.aula3_Estrutura_de_decisao;

public class Atividade3 {
    public static void main(String[] args) {
        //3 — Crie uma variável opcao com um número de 1 a 4 e, usando switch, mostre o pedido escolhido no cardápio: 1 é Café, 2 é Cappuccino, 3 é Chocolate quente e 4 é Chá. Qualquer outro número mostra "Opção inválida".

        int opcao = 5;

        switch (opcao) {
            case 1:
                System.out.println("Pedido do cardápio: Café");
                break;
            case 2:
                System.out.println("Pedido do cardápio: Cappuccino");
                break;
            case 3:
                System.out.println("Pedido do cardápio: Chocolate Quente");
                break;
            case 4:
                System.out.println("Pedido do cardápio: Chá");
                break;
                default:
                    System.out.println("Opção inválida");
        }
    }
}
