package com.ayaz.factory;

public class RocketEnemyShip extends EnemyShip{

    private String name2;

    public RocketEnemyShip(){
        setName("Rocket Enemy Ship");
        setDamage(22.0);
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }
    public void followHeroShip1(){
        System.out.println(getName()+" is following the hero");
    }
}
