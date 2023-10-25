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
            animal.eat("something");
            animal.makeNoise();
            animal.sleep();
            System.out.println("-------------------");
        }
    }
}
