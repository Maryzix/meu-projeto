package org.example.Modulo2.atividadesSingleton;

public class Atividade6 {
    public static void main(String[] args) {
        //Depois, no main, obtenha ele duas vezes em variáveis diferentes pagina1 e pagina2, registre visitas usando as duas, e imprima o total. O resultado deve mostrar que as duas variáveis usam o mesmo contador.
        //Exemplo de saída esperada:
        //Total de visitas: 3
        //Dica: Para instanciar(criar) não use o new. Classe v1 = Classe.getInstancia();

        ContadorVisitas pagina1 = ContadorVisitas.getInstancia();
        ContadorVisitas pagina2 = ContadorVisitas.getInstancia();

        pagina1.registrarVisita();
        pagina1.registrarVisita();
        pagina2.registrarVisita();

        System.out.println("Total de visitas: " + pagina1.getTotal());
    }
}
