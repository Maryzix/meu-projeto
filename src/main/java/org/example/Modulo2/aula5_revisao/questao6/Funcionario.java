
package org.example.Modulo2.aula5_revisao.questao6;

public abstract class Funcionario {

    private String nome;
    private double salarioBase;

    // Construtor: recebe nome e salarioBase
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        setSalarioBase(salarioBase);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            System.out.println("Não aceitamos valores negativos aqui");
        } else {
            this.salarioBase = salarioBase;
        }
    }

    public double getSalarioBase() {
       return salarioBase;
    }
    public abstract double calcularSalario();
}
