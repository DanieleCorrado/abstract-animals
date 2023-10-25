package org.lesson.java.animal;

public abstract class Animale {

    // Atributi

    String name;

    // Costruttori

    public Animale(String name) {
        this.name = name;
    }

    // Metodi

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void dormi() {
        System.out.println("Zzz");
    }

    public abstract void mangia();

    public abstract void verso();
}
