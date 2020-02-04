package com.ayaz.strategy;

public class Animal implements Flays {

    private String name;
    private int age;

    public Flays flays;

    @Override
    public String flay() {
        return null;
    }
    public String tryToFly(){
        return flays.flay();
    }
    public void setFlyingAbility(Flays flays){
        this.flays=flays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
