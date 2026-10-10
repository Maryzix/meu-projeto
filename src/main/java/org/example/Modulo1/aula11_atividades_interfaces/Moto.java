package org.example.Modulo1.aula11_atividades_interfaces;

public class Moto implements Veiculo{
    @Override
    public void ligar() {
        System.out.println("Ligando a moto... Aguarde...");
    }
    @Override
    public void acelerar(){
        System.out.println("Moto ligada! Acelerando...");
    }
}
