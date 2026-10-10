package org.example.Modulo2.atividades_heranca;

public class Atividade2 {
    public static void main(String[] args){
        //2. Acrescente na Aluna o atributo curso e o metodo estudar(), que
        //   imprime "[nome] está estudando [curso]."
        //
        //   Preencha os três atributos no objeto e chame os dois métodos.
        //
        //   Repare que o estudar() usa o nome, que veio da mãe.

        Aluna ana = new Aluna();
        ana.nome = "Ana";
        ana.idade = 21;
        ana.curso = "Java";

        ana.apresentar();
        ana.estudar();

    }
}
