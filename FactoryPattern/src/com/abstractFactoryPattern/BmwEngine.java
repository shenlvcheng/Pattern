package com.abstractFactoryPattern;

public class BmwEngine implements IEngine{
    @Override
    public void getEngineName() {
        System.out.println("宝马引擎");
    }
}
