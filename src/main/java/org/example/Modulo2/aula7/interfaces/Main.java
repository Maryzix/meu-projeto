package org.example.Modulo2.aula7.interfaces;

public class Main {
    public static void main(String[] args) {
        //instanciar um objeto

        MySql mySql = new MySql();
        MongoDb oracle = new MongoDb();

        MongoDb mongoDbFilho = new MongoDb();
        mongoDbFilho.pessoa = "";
        

        //base de tudo

        BancoDeDados outroBanco = new MongoDb();


        metodo(mySql);
    }
    //metodo que recebe um objeto banco
    //da para fazer receber mysql tbm
    public static void metodo(BancoDeDados banco){
        //aqui espera receber MySql ou MongoDb
    }
}
