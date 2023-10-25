package org.lesson.java.animal;

public class Delfino extends Animale implements Nuota {

    // Costruttori
    public Delfino(String name) {
        super(name);
    }

    // Metodi
    @Override
    public void verso() {
        System.out.println("Verso di delfino");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio pesce");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
