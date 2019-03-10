package com.factoryPattern;

public class AnimalFactoryTest {
    public static void main(String[] args) {
        IAnimal animal = new Bird();
        animal.name();
        animal = new Dog();
        animal.name();
        animal = new Pig();
        animal.name();

    }
}
