package com.abstractFactoryPattern;

public class ToyotaCar implements ICar {
    @Override
    public IEngine getEngine() {
        return new ToyotaEngine();
    }

    @Override
    public IWheel getWheel() {
        return new BridgestoneWheel();
    }
}
