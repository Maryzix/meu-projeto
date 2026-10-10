package org.example.Modulo2.atividades_heranca;

public class Atividade5 {
    public static void main (String[] args) {
        //5. Faça uma cadeia de três níveis:
        //   - Funcionario, com o atributo nome e o metodo baterPonto()
        //   - Gerente extends Funcionario, com aprovarFerias(String quem)
        //   - Diretora extends Gerente, com definirMeta(String meta)
        //
        //   Na Main, crie uma Diretora, preencha o nome dela
        //   (carla.nome = "Carla";) e chame OS TRÊS métodos no mesmo objeto.
        //
        //   Herança em cadeia: ela tem tudo que vem de cima.

        Diretora diretora = new Diretora();
        diretora.nome = "Carla";

        diretora.baterPonto();
        diretora.aprovarFerias("Ana");
        diretora.definirMeta("R$40.000 no mês");

    }
}
