package org.example.Modulo2.atividades_polimorfismo;

public class Atividade4 {
    public static void main(String[] args){

        Estagiaria estagiaria = new Estagiaria();
        estagiaria.nome = "Mary";
        estagiaria.idade = 25;

        Pessoa pessoa = estagiaria;

        pessoa.apresentar();

        //Porque Estagiaria não sobrescreveu o metodo. Portanto, ela utiliza a implementação herdada de Pessoa. ( @Override).
        //Se eu criar um apresentar() com overrride dentro de estagiaria, vai utilizar a apresentação de estagiaria
        //uma variável do tipo da mãe pode referenciar um objeto da filha.
        //E se a filha não sobrescreve o metodo, é executada a implementação herdada.
    }
}
