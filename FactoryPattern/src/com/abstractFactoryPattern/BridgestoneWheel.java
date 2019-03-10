package com.abstractFactoryPattern;

public class BridgestoneWheel implements  IWheel {
    @Override
    public void getWheelName() {
        System.out.println("普利司通轮胎");
    }
}
