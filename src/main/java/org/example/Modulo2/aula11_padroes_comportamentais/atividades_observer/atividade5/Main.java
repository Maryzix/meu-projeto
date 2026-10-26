package org.example.Modulo2.aula11_padroes_comportamentais.atividades_observer.atividade5;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        RegistroEstoque registroEstoque = new RegistroEstoque();

        estoque.adicionarObservador(registroEstoque);

        estoque.setQuantidade(10);
        estoque.setQuantidade(6);
    }
}
