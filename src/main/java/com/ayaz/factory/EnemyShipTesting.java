package com.ayaz.factory;

import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipFactory factory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        Scanner userImput = new Scanner(System.in);
        String enemyShipOption ="";
        System.out.println("What type of ship? (U/R or B)");
        if(userImput.hasNextLine()){
            String typeOfShip=userImput.nextLine();
            theEnemy=factory.makeEnemyShip(typeOfShip);
        }

        if(theEnemy!=null){
            doStuffEnemy(theEnemy);
        }
    }
    public static void doStuffEnemy(EnemyShip onEnemyShip){
        onEnemyShip.displayEnemyShip();
        onEnemyShip.followHeroShip();
        onEnemyShip.enemyShipShoots();
        if(onEnemyShip instanceof RocketEnemyShip){
            ((RocketEnemyShip) onEnemyShip).followHeroShip1();
        }
    }
}
