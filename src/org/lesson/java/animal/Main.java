package org.lesson.java.animal;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("Argan"),
                new Dolphine("Flipper"),
                new Eagle("Ben"),
                new Sparrow("Jack")
        };

        for (Animal animal : animals) {
            System.out.println(animal.getName());
            animal.eat();
            animal.makeNoise();
            animal.sleep();
            if (animal instanceof CanFly) {
                ((CanFly) animal).canFly();
            } else if (animal instanceof CanSwim) {
                ((CanSwim) animal).canSwim();
            }
            System.out.println("-------------------");
        }
    }
}
