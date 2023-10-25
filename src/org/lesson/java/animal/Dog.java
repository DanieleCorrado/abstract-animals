package org.lesson.java.animal;

public class Dog extends Animal implements CanSwim{

    // Costruttori
    public Dog(String name) {
        super(name);
    }

    // Metodi
    @Override
    public void makeNoise() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("I eat meat");
    }

    @Override
    public void canSwim() {
        System.out.println("I'm swimming");
    }
}
