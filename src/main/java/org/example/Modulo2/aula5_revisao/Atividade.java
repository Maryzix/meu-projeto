package org.example.Modulo2.aula5_revisao;

public class Atividade {
    public static void main(String[] args) {
        //Questão 3: Getters e Setters
        //Crie uma classe Produto com os atributos privados nome (String), preco (double) e quantidade (int).
        //Crie getters e setters para todos os atributos.
        //O setter de preco não deve aceitar valores menores ou iguais a zero.
        //O setter de quantidade não deve aceitar valores negativos.
        //No main, crie um produto, preencha os atributos pelos setters, tente colocar um preço negativo, e imprima os dados usando os getters.

        Produto produto = new Produto();

        produto.setNome("Kindle");
        produto.setPreco(800.0);
        produto.setQuantidade(1);

        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.getQuantidade());

        //Questão 5
        //c) No main, crie um Retangulo, chame exibirNome() e imprima a área.
        //d) Agora tente escrever Forma f = new Forma("teste");. O que acontece? Por quê?

        Retangulo retangulo = new Retangulo("Retangulo");
        //Forma f = new Forma("teste");
        Forma f = new Retangulo("teste");
        retangulo.largura = 8.5;
        retangulo.altura = 3.2;
        System.out.printf("%.2f", retangulo.calcularArea());

    }
}
