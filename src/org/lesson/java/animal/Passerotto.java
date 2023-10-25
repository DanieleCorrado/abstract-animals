package org.lesson.java.animal;

public class Passerotto extends Animale implements Vola {

    // Costruttori
    public Passerotto(String name) {
        super(name);
    }

    // Metodi
    @Override
    public void verso() {
        System.out.println("Verso di passerotto");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio vermi");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
