package org.lesson.java.animal;

public class Dolphine extends Animal{

    // Costruttori
    public Dolphine(String name) {
        super(name);
    }

    // Metodi
    @Override
    public void makeNoise() {
        System.out.println("Delphine noise");
    }
}
