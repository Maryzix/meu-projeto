package org.example.Modulo2.aula8;

public class Agendamento {
    //1. Crie a classe Agendamento com TODOS estes atributos,
    //   recebidos num construtor só:
    //
    //   - nomePet (String)
    //   - servico (String)
    //   - horario (String)
    //   - perfume (boolean)
    //   - laco (boolean)
    //   - hidratacao (boolean)
    //   - observacao (String)
    //   - desconto (double)

    String nomePet;
    String servico;
    String horario;
    String observacao;
    boolean perfume;
    boolean laco;
    boolean hidratacao;
    double desconto;

    // Construtor
    public Agendamento(String nomePet, String servico, String horario, boolean perfume, boolean laco, boolean hidratacao, String observacao, double desconto) {

        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;
    }

    // Metodo para mostrar os dados
    public void mostrar() {
        System.out.println("Nome do pet: " + nomePet);
        System.out.println("Serviço: " + servico);
        System.out.println("Horário: " + horario);
        System.out.println("Perfume: " + perfume);
        System.out.println("Laço: " + laco);
        System.out.println("Hidratação: " + hidratacao);
        System.out.println("Observação: " + observacao);
        System.out.println("Desconto: " + (desconto * 100) + "%");
        System.out.println("-------------------------");
    }
}

