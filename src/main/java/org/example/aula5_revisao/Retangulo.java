package org.example.aula5_revisao;

public class Retangulo extends Forma{
    double largura;
    double altura;

    public Retangulo(String nome) {
        super(nome);
    }

    @Override
    double calcularArea() {
        return largura * altura;
    }
}
