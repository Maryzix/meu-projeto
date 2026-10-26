package org.example.Modulo2.aula11_padroes_comportamentais.atividades_observer.atividade5;

public class RegistroEstoque implements ObservadorEstoque{

    @Override
    public void atualizar(int quantidade) {
        System.out.println("Nova quantidade: " + quantidade);
    }
}
