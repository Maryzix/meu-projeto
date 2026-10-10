package org.example.Modulo1.aula11_atividades_interfaces;

import java.util.ArrayList;

public class Atividade3 {
    public static void main(String[] args) {
        //3. Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,
        //   e percorra com for-each chamando emitirSom(). Repare que não
        //   tem nenhum if. Dica:
        //animais.add(new Cachorro());

        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        Gato sashimi = new Gato();
        Cachorro pudim = new Cachorro();

        for ( Animal animal : animais){
           animal.emitirSom();
        }
    }
}
