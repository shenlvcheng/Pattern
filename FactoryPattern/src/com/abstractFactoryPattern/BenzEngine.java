package com.abstractFactoryPattern;

public class BenzEngine implements IEngine {
    @Override
    public void getEngineName() {
        System.out.println("奔驰引擎");
    }
}
