package org.example.Modulo2.atividades_heranca;

public class Atividade3 {
    public static void main (String [] args){
        //3. Crie a classe Professora, também filha de Pessoa, com o atributo
        //   disciplina e o metodo lancarNota(String aluna, double nota), que
        //   imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
        //   com %.1f.
        //
        //      Na Main, crie uma aluna e uma professora, preencha os atributos de
        //   cada objeto e chame os métodos das duas.

        Aluna carla = new Aluna();
        Professora flora = new Professora();

        carla.nome = "Carla";
        carla.idade = 21;
        carla.curso = "Java";

        flora.nome = "Flora";
        flora.idade = 35;
        flora.disciplina = "Programação";

        carla.apresentar();
        carla.estudar();

        flora.lancarNota("Carla", 9.5);

    }
}
