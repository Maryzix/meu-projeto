package org.example.Modulo2.AtividadesSingleton;

public class Carrinho {
    //7. Crie uma classe Singleton chamada Carrinho que:
    //-tenha um atributo quantidadeItens, começando em 0;
    //-tenha um metodo adicionarItem() que soma 1 à quantidade;
    //-tenha um metodo getQuantidadeItens() que devolve a quantidade.

    private static Carrinho instancia;
    private int quantidadeItem = 0;

    private Carrinho() {
    }

    public void adicionarItem() {
        quantidadeItem++;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public static Carrinho getInstancia() {
        if (instancia == null) {
            instancia = new Carrinho();
        }

        return instancia;
    }
}
