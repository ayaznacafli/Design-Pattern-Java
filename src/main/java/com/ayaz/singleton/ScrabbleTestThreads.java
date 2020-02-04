package com.ayaz.singleton;

public class ScrabbleTestThreads {

    public static void main(String[] args) {
        Runnable getTitles = new GetTheTiles();
        Runnable getTilesAgain = new GetTheTiles();


        new Thread(getTitles).start();
        new Thread(getTilesAgain).start();

    }
}
