package org.example.Modulo2.aula9;

import lombok.Builder;

public class Agendamento {
    //Refatore seu código da atividade de construtor com o Builder (Pode utilizar lombok).
    //package org.example.Modulo2.aula7.builder;

    String nomePet;
    String servico;
    String horario;
    String observacao;
    boolean perfume;
    boolean laco;
    boolean hidratacao;
    double desconto;

           private Agendamento(Builder builder){
               this.nomePet = builder.nomePet;
               this.servico = builder.servico;
               this.horario = builder.horario;
               this.observacao = builder.observacao;
               this.perfume = builder.perfume;
               this.laco = builder.laco;
               this.hidratacao = builder.hidratacao;
               this.desconto = builder.desconto;
           }

            public static class Builder{
               String nomePet;
               String servico;
               String horario;
               String observacao;
               boolean perfume;
               boolean laco;
               boolean hidratacao;
               double desconto;

                public Builder nomePet(String nomePet){
                    this.nomePet = nomePet;
                    return this;
                }

                public Builder servico(String servico){
                    this.servico = servico;
                    return this;
                }

                public Builder horario(String horario){
                    this.horario = horario;
                    return this;
                }

                public Builder observacao(String observacao){
                    this.observacao = observacao;
                    return this;
                }

                public Builder perfume(boolean perfume){
                    this.perfume = perfume;
                    return this;
                }

                public Builder laco(boolean laco){
                    this.laco = laco;
                    return this;
                }

                public Builder hidratacao(boolean hidratacao){
                    this.hidratacao = hidratacao;
                    return this;
                }

                public Builder desconto(double desconto){
                    this.desconto = desconto;
                    return this;
                }

                public Agendamento build(){
                    return new Agendamento(this);
                }
            }

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
