package org.lesson.java.animal;

public class Eagle extends Animal implements CanFly{

    // Costruttori
    public Eagle(String name) {
        super(name);
    }

    // Metodi
    @Override
    public void makeNoise() {
        System.out.println("Eagle noise");
    }

    @Override
    public void eat() {
        System.out.println("I eat meat");
    }

    @Override
    public void canFly() {
        System.out.println("I'm fling");
    }
}
