package org.lesson.java.animal;

public class Eagle extends Animal{

    // Costruttori
    public Eagle(String name) {
        super(name);
    }

    // Metodi
    @Override
    public void makeNoise() {
        System.out.println("Eagle noise");
    }

}
