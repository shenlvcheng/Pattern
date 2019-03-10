package com.simpleFactoryPattern;

public class AnimalFactory {

    public static IAnimal getAnimal(String str)
    {
        switch (str)
        {
            case "pig":return new Pig();
            case "dog":return new Dog();
            case "bird":return new Bird();
            default:return null;
        }
    }

}
