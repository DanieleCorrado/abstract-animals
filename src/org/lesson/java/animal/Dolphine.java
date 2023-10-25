package org.lesson.java.animal;

public class Dolphine extends Animal implements CanSwim{

    // Costruttori
    public Dolphine(String name) {
        super(name);
    }

    // Metodi
    @Override
    public void makeNoise() {
        System.out.println("Delphine noise");
    }

    @Override
    public void eat() {
        System.out.println("I eat fish");
    }

    @Override
    public void canSwim() {
        System.out.println("I'm swimming");
    }
}
