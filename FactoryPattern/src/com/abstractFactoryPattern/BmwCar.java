package com.abstractFactoryPattern;

public class BmwCar implements ICar {
    @Override
    public IEngine getEngine() {
        return new BmwEngine();
    }

    @Override
    public IWheel getWheel() {
        return new MichelinWheel();
    }
}
