package org.lesson.java.animal;

public class Sparrow extends Animal implements CanFly{

    // Costruttori
    public Sparrow(String name) {
        super(name);
    }

    // Metodi
    @Override
    public void makeNoise() {
        System.out.println("Sparrow noise");
    }

    @Override
    public void eat() {
        System.out.println("I eat worm");
    }

    @Override
    public void canFly() {
        System.out.println("I'm fling");
    }
}
