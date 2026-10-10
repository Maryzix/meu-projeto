package org.example.Modulo1.aula8_Excecao;

public class Teste {
    public static void main(String[] args) {

        try{
            int resultado = 10 / 0;
            System.out.println(resultado);
        }catch(ArithmeticException ae){
            System.out.println("Não se divide por 0");
        }finally{
            System.out.println("isso sempre roda"); // para finalizar o programa, ele sempre fica no final.
            //tipo abriu um PDF, achou erro e fecha o pdf pq ta ocupando espaço na memoria
        }

        System.out.println("continua");


    }
}
