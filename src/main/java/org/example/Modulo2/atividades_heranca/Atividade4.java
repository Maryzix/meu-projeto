package org.example.Modulo2.atividades_heranca;

public class Atividade4 {
    public static void main (String[] args){
        //4. Na Professora, sobrescreva o apresentar() usando @Override, pra
        //   imprimir "Oi, sou [nome] e ensino [disciplina]."
        //
        //   Chame apresentar() na aluna e na professora e compare as saídas.


        Aluna mary = new Aluna();
        Professora flora = new Professora();

        mary.nome = "Mary";
        mary.curso = "Java";
        flora.nome = "Flora";
        flora.disciplina = "Java";

        mary.apresentar();
        flora.apresentar();
    }
}
