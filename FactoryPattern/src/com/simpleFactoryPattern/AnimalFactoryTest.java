package com.simpleFactoryPattern;

public class AnimalFactoryTest {
    public static void main(String[] args) {
        AnimalFactory.getAnimal("pig").name();
        AnimalFactory.getAnimal("dog").name();
        AnimalFactory.getAnimal("bird").name();
        AnimalFactory.getAnimal("monkey").name();
    }
}
