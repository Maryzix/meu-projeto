package org.example.aula5_revisao;

public class Produto {
   //nome (String), preco (double) e quantidade (int)

    private String nome;
    private double preco;
    private int quantidade;

    //isso é o construtor
    public void setNome (String nome){
        this.nome = nome;
    } //set muda o resultado

    public String getNome(){
        return this.nome;
    } // retorna o valor, nao printa na tela, mas se quiser tem q usar o getNome.
    //System.out.println(instanciaDaMinhaClasse.getNome) ?

    //O setter de preco não deve aceitar valores menores ou iguais a zero.
    public void setPreco (double preco){
        if (preco <= 0){ // variavel que foi criada dentro do parentesesss
            System.out.println("Não aceitamos 0 aqui");
        }else{
            this.preco = preco; //fazendo relção com a propriedade que foi declarada à cima
        }
    } //set muda o resultado

    public Double getPreco(){
        return this.preco;
    }

    //O setter de quantidade não deve aceitar valores negativos.
    public void setQuantidade (int quantidade){
        if (quantidade < 0){
            System.out.println("Não aceitamos valores negatios aqui");
        }else {
            this.quantidade = quantidade;
        }
    } //set muda o resultado

    public int getQuantidade(){
        return this.quantidade;
    }




}
