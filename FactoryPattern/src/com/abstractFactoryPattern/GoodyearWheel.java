package com.abstractFactoryPattern;

public class GoodyearWheel implements IWheel {
    @Override
    public void getWheelName() {
        System.out.println("固特异轮胎");
    }
}
