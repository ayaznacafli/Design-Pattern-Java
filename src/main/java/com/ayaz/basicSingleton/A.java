package com.ayaz.basicSingleton;

public class A {

    private static A obj = new A(); //Early

    private A(){

    }
    public static A getA(){
        return obj;
    }
    public void doSomething(){

    }
}
