package org.example.aula5_revisao.questao6;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }


    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.20;
    }



    //Desenvolvedor: o salário é o salário base mais 20%. ( salario = salarioBase + (salarioBase * 0.20) ou
    //salario = salarioBase * 1.20




}
