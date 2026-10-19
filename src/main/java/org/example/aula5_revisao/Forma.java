package org.example.aula5_revisao;

public abstract class Forma {
    //Questão 5: Classe abstrata
    //a) Crie uma classe abstrata Forma com:
    //um atributo nome;
    //um construtor que recebe o nome;
    //um metodo normal exibirNome(), que imprime o nome da forma;
    //um metodo abstrato calcularArea(), que retorna um double.
    //b) Crie uma classe Retangulo que herda de Forma, tem os atributos largura e altura, e implementa calcularArea().
    //c) No main, crie um Retangulo, chame exibirNome() e imprima a área.
    //d) Agora tente escrever Forma f = new Forma("teste");. O que acontece? Por quê? java: org.example.aula5_revisao.Forma is abstract; cannot be instantiated

    String nome;

    public Forma(String nome){
        this.nome = nome;
    }

    public void exibirNome(){
        System.out.println(this.nome);
    }

    abstract double calcularArea();
}
