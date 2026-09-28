package org.example.aula3operadores_relacionais;
import jdk.swing.interop.SwingInterOpUtils;
public class Atividade1 {
    public static void main(String[] args) {
        /*
        Relacionais:
        1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de: são iguais, são diferentes, a primeira é maior, a primeira é menor para quando:
         a = 10, b = 3
         a = 3, b = 10
         a = 5, b = 5
        * */
        int notaCarla = 5;
        int notaAna = 5;


        if (notaCarla == notaAna) {
            System.out.println("As da Carla e Ana são iguais");
            System.out.println("Ana: " + notaAna);
            System.out.println("Carla: " + notaCarla);
        } else if (notaAna > notaCarla) {
            System.out.println("A nota da Ana é maior que a da Carla");
            System.out.println("Ana: " + notaAna);
            System.out.println("Carla: " + notaCarla);
        } else {
            System.out.println("A nota da Carla é maior que a da Ana");
            System.out.println("Ana: " + notaAna);
            System.out.println("Carla: " + notaCarla);
        }

        /*
        Foi passado para fazer que é diferente, mas por conta de também haver a opção de colocar MAIOR ou MENOR que, ficaria quebrado o código pois é redundante... Então aqui está como seria caso precisemos identificar se o valor da nota de Ana e Cara são diferentes

        if (notaCarla != notaAna) {
            System.out.println("As nota da Carla e Ana são diferentes.");
            System.out.println("Ana: " + notaAna);
            System.out.println("Carla: " + notaCarla);
        }
        * */
    }
}
