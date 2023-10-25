package org.lesson.java.animal;

public class Sparrow extends Animal{

    // Costruttori
    public Sparrow(String name) {
        super(name);
    }

    // Metodi
    @Override
    public void makeNoise() {
        System.out.println("Sparrow noise");
    }
}
