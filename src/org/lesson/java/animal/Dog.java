package org.lesson.java.animal;

public class Dog extends Animal{

    // Costruttori
    public Dog(String name) {
        super(name);
    }

    // Metodi
    @Override
    public void makeNoise() {
        System.out.println("Woof");
    }
}
