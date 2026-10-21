package org.example.Modulo2.aula8;

public class Main {

    public static void main(String[] args) {
        //Na Main, crie 3 agendamentos:
        //   a) Thor, banho, 14h, com perfume e laço, sem hidratação,
        //      "alérgico a shampoo", 10% de desconto
        //   b) Luna, tosa, 10h, sem nenhum extra, sem observação,
        //      sem desconto
        //   c) Mel, banho, 16h, só com hidratação, sem observação,
        //      sem desconto

        // a) Thor
        Agendamento thor = new Agendamento(
                "Thor",
                "Banho",
                "14h",
                true,
                true,
                false,
                "Alérgico a shampoo",
                0.10
        );

        // b) Luna
        Agendamento luna = new Agendamento(
                "Luna",
                "Tosa",
                "10h",
                false,
                false,
                false,
                "Sem observação",
                0.0
        );

        // c) Mel
        Agendamento mel = new Agendamento(
                "Mel",
                "Banho",
                "16h",
                false,
                false,
                true,
                "Sem observação",
                0.0
        );

        // Exibindo os agendamentos
        thor.mostrar();
        luna.mostrar();
        mel.mostrar();

        // Agora responda:
        //   1. Olhando só a linha do new, dá pra saber o que cada true/false significa?
        //
        //   Sim, mas não é tão fácil. Preciso consultar a ordem dos parâmetros no construtor para saber se cada boolean representa perfume, laço ou hidratação.
        //
        //2. Se você trocar a ordem do perfume e do laço sem querer, o código compila? Alguém perceberia o erro?
        //
        //Sim, o código compila! Como os dois parâmetros são do tipo boolean, o Java não consegue identificar que eles foram trocados. O erro pode passar despercebido e causar um comportamento incorreto.
        //
        //3. No agendamento B, quantos valores você digitou só pra dizer "não quero isso"?
        //
        //Três valores false: um para perfume, um para laço e outro para hidratação. Isso deixa o construtor mais verboso e pode dificultar a leitura do código.
    }
}