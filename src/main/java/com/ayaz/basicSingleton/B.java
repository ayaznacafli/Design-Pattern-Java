package com.ayaz.basicSingleton;

public class B {

    private static B obj;

    private B(){

    }

    public static B getB(){
        if(obj == null){
            synchronized (B.class){
                if(obj == null){
                    obj = new B(); //instance will be created at request time
                }
            }
        }
        return obj;
    }

    public void doSomething(){
        // create your code
    }
}
