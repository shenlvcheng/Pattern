package com.abstractFactoryPattern;

public class BenzCar implements ICar {
    @Override
    public IEngine getEngine() {
        return new BenzEngine();
    }

    @Override
    public IWheel getWheel() {
        return new GoodyearWheel();
    }
}
