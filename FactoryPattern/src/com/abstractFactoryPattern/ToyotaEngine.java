package com.abstractFactoryPattern;

public class ToyotaEngine implements  IEngine {

    @Override
    public void getEngineName() {
        System.out.println("TOYOTA引擎");
    }
}
