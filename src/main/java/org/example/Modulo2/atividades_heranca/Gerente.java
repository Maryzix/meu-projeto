package org.example.Modulo2.atividades_heranca;

public class Gerente extends Funcionario implements Notificavel, Exportavel {
    void aprovarFerias(String quem){
        System.out.println("Funcionou aprovarFerias");
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("Funcionou notificar");
    }

    @Override
    public void exportar() {
        System.out.println("Funcionou exportar");
    }

    //Class cannot extend multiple classes

}
