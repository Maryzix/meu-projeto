package org.example.aula2_Aritmeticos;

public class AtividadeAritConc {
    public static void main(String[] args) {
                /*
        Aritméticos:
        0- Rode esse código:
            System.out.println("2 + 2 = " + 2 + 2);.
        Agora rode:
            System.out.println("2 + 2 = " + (2 + 2));
        Explique em um comentário por que deram resultados diferentes
        */

        System.out.println("Atividade (Aritméticos + concatenação)");

        System.out.println("2 + 2 = " + 2 + 2);
        /*O resultado foi 22 porque o Java entende o + como concatenação quando estamos trabalhando com uma String, juntando os valores.
        Tipo "meu nome é" + nome*/

        System.out.println("2 + 2 = " + (2 + 2));
        /*O resultado foi 4 porque os parênteses fazem o Java calcula primeiro a soma e depois
          juntar o resultado com o texto.
          Primeiro soma > 4
          depois concatena > "Resultado: 4"*/

    }
}
