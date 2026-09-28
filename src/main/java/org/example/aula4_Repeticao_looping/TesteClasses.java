package org.example.aula4_Repeticao_looping;

public class TesteClasses {
    public static void main(String[] args) {
        //Scanner scammer = new Scanner(System.in);

        //nós criamos uma classe chamada Veiculo, dentro do veiculo tem as veriaveis que um veiculo pode ter. Aqui nessa classe, eu to chamando a classe Veiculo e adicionando DADOS e pegando as especificações do carro dentro da classe Veiculo
        Veiculo fiatUno = new Veiculo();
        //aqui adicionei o fiatUno usando Veiculo

        fiatUno.qtdPortas = 4; //aqui adicionei a quantidade de portas q o veiculo tem
        fiatUno.marca = "Fiat"; //e aqui a marca


        System.out.println(fiatUno.marca);


    }
}
