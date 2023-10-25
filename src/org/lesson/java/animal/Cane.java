package org.lesson.java.animal;

public class Cane extends Animale implements Nuota {

    // Costruttori
    public Cane(String name) {
        super(name);
    }

    // Metodi
    @Override
    public void verso() {
        System.out.println("Woof");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio carne");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
