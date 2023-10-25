package org.lesson.java.animal;

public abstract class Animal {

    // Atributi

    String name;

    // Costruttori

    public Animal(String name) {
        this.name = name;
    }

    // Metodi

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println("Zzz");
    }

    public abstract void eat();

    public abstract void makeNoise();
}
