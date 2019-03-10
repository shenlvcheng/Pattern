package com.abstractFactoryPattern;

public class MichelinWheel implements IWheel {
    @Override
    public void getWheelName() {
        System.out.println("米其林轮胎");
    }
}
