package com;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class jdkProxy implements InvocationHandler {

    private Person person;

    public jdkProxy(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前面执行");
        Object object = method.invoke(person,args);
        System.out.println("后面执行");
        return object;
    }

    public static void main(String[] args) {
        jdkProxy jdk = new jdkProxy(new sharifPerson());
        Person object = (Person)Proxy.newProxyInstance(jdk.getClass().getClassLoader(),new Class[]{Person.class},jdk);
        object.getName();
    }
}
