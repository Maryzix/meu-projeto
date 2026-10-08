package org.example.aula11_foreach_interfaces;

import java.util.ArrayList;
import java.util.List;

public class AulaInterfaces {
    public static void main(String[] args) {
        Coelho pernalonga = new Coelho();
        pernalonga.fugir();

        Pombo dove = new Pombo();
        dove.fugir();

        Coelho pernalongo = new Coelho();
        Presa coelinho = new Coelho();
        Presa pombinho = new Pombo();

        ArrayList<String> lista = new ArrayList<>();
        List <ArrayList> lista2 = new ArrayList<>();

    }
}
