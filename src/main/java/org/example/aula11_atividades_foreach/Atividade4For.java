package org.example.aula11_atividades_foreach;

public class Atividade4For {
    public static void main(String[] args) {
        //4. Com um array de nomes, use for-each e um if para contar quantos
        //   têm mais de 5 letras. Mostre o total. Dica: usem o metodo length.

        String [] nomes = {"Ana","Eduarda", "Giovanna", "Carlinha","Maria"};
        int total = 0;

        for(String nome : nomes){
            if ((nome.length() > 5)){
                System.out.println("Esses nomes tem 5 letras: " + nome);
                total = total + 1;
            }
        }

        System.out.println("O total de nomes é: " + total);


    }
}
