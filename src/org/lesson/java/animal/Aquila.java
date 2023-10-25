package org.lesson.java.animal;

public class Aquila extends Animale implements Vola {

    // Costruttori
    public Aquila(String name) {
        super(name);
    }

    // Metodi
    @Override
    public void verso() {
        System.out.println("Verso d'aquila");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio carne");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
