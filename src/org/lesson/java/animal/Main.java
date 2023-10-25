package org.lesson.java.animal;

public class Main {

    public static void main(String[] args) {

        Animale[] animales = {
                new Cane("Argan"),
                new Delfino("Flipper"),
                new Aquila("Ben"),
                new Passerotto("Jack")
        };

        for (Animale animale : animales) {
            System.out.println(animale.getName());
            animale.mangia();
            animale.verso();
            animale.dormi();
            if (animale instanceof Vola) {
                faiVolare((Vola) animale);
            }
            else if (animale instanceof Nuota) {
                faiNuotare((Nuota) animale);
            }
            System.out.println("-------------------");
        }

    }

    public static void faiVolare(Vola animal){
        animal.vola();
    }

    public static void faiNuotare(Nuota animal) {
        animal.nuota();
    }
}
