package org.example.Modulo2.atividades_polimorfismo;

public class Atividade3 {
    public static void main(String[] args) {
//        //3. Crie a classe Professora, também filha de Pessoa, com o atributo
//          disciplina e o metodo lancarNota(String aluna, double nota), que
//          imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
//          com %.1f.
//
        //   Na Main, crie uma aluna e uma professora e dê valor aos atributos
        //   de cada objeto:
        //
        //   Professora flora = new Professora();
        //   flora.nome = "Flora";
        //   flora.idade = 30;
        //   flora.disciplina = "Java e IA";
        //
        //   Faça o mesmo com a aluna e chame os métodos das duas.

        Aluna carla = new Aluna();
        carla.nome = "Carla";
        carla.idade = 20;

        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 30;
        flora.disciplina = "Java e IA";

        carla.apresentar();
        flora.apresentar();

        flora.lancarNota(carla.nome, 9.5);

    }
}
