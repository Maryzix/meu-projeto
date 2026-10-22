package org.example.Modulo2.aula9;

public class Main {
    public static void main(String[] args) {
        Agendamento thor = new Agendamento.Builder()
                .nomePet("Thor")
                .servico("Banho")
                .horario("14h")
                .perfume(true)
                .laco(false)
                .hidratacao(false)
                .observacao("Alérgico a Shampoo")
                .desconto(0.10).build();

        Agendamento luna = new Agendamento.Builder()
                .nomePet("Luna")
                .servico("Tosa")
                .horario("10h")
                .perfume(false)
                .laco(false)
                .hidratacao(false)
                .observacao("Sem observação")
                .desconto(0.0).build();

        Agendamento mel = new Agendamento.Builder()
                .nomePet("Mel")
                .servico("Banho")
                .horario("16h")
                .perfume(false)
                .laco(false)
                .hidratacao(true)
                .observacao("Sem observação")
                .desconto(0.0).build();

                // Exibindo os agendamentos
                thor.mostrar();
                luna.mostrar();
                mel.mostrar();
    }
}
