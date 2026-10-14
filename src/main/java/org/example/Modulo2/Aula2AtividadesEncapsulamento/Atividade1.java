package org.example.Modulo2.Aula2AtividadesEncapsulamento;

public class Atividade1 {
    public static void main (String [] args){
        ContaBancaria conta = new ContaBancaria();
        Produto produto = new Produto();


        System.out.println(conta.getTitular());
        System.out.println(conta.getSaldo());
        //Java: titular has private access in org.example.Modulo2.AtividadesEncapsulamento.ContaBancaria

        conta.setTitular("");
        conta.setTitular("Ana");

        System.out.println(conta.getTitular());
        conta.depositar(300);
        //conta.registrarLog("teste");
        //System.out.println(produto.codigoInterno());
        //java: method codigoInterno in class org.example.Modulo2.AtividadesEncapsulamento.Produto cannot be applied to given types;
        System.out.println(produto.nome);
        System.out.println(produto.preco());
       // conta.numeroConta();
        //java: cannot find symbol
        //  symbol:   method getnumeroConta()
        //conta.setNumeroConta("999-Z");


    }
}
