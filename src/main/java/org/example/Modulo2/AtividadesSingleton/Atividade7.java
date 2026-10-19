package org.example.Modulo2.AtividadesSingleton;

public class Atividade7 {
    public static void main(String[] args) {
        //No main, obtenha o carrinho em duas variáveis diferentes, telaProdutos e telaPromocoes, adicione itens usando as duas, e imprima a quantidade final. O resultado deve mostrar que as duas telas usam o mesmo carrinho.

        //Exemplo de saída esperada:
        //Itens no carrinho: 4

        Carrinho telaProdutos = Carrinho.getInstancia();
        Carrinho telaPromocoes = Carrinho.getInstancia();

        telaProdutos.adicionarItem();
        telaProdutos.adicionarItem();
        telaPromocoes.adicionarItem();
        telaPromocoes.adicionarItem();

        System.out.println("Total de itens no carrinho: " + telaProdutos.getQuantidadeItem());
    }
}
