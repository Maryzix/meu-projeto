package org.example.Modulo1.aula11_atividades_interfaces;

public class Carro implements Veiculo{
    @Override
    public void ligar() {
        System.out.println("Ligando o carro... Aguarde...");
    }
    @Override
    public void acelerar(){
        System.out.println("Carro ligado! Acelerando...");
    }
}
