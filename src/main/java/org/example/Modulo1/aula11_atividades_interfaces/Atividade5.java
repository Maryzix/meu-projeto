package org.example.Modulo1.aula11_atividades_interfaces;

import java.util.ArrayList;

public class Atividade5 {
    public static void main (String[] args){
            //5. Crie uma interface Veiculo com DOIS métodos: ligar() e acelerar().
        //   Crie Carro e Moto implementando os dois. Coloque numa lista e
        //   percorra com for-each chamando os dois métodos em cada um.

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Moto());
        veiculos.add(new Carro());
        Moto suzuki = new Moto();
        Carro BMW = new Carro();

        for ( Veiculo veiculo : veiculos){
            veiculo.ligar();
            veiculo.acelerar();
        }
    }
}
