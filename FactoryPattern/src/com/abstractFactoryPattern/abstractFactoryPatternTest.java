package com.abstractFactoryPattern;

public class abstractFactoryPatternTest {
    public static void main(String[] args) {
        ICar car = new BenzCar();
        car.getEngine().getEngineName();
        car.getWheel().getWheelName();
        car = new BmwCar();
        car.getEngine().getEngineName();
        car.getWheel().getWheelName();
        car = new ToyotaCar();
        car.getEngine().getEngineName();
        car.getWheel().getWheelName();
    }
}
