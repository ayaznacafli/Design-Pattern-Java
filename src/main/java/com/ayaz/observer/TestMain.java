package com.ayaz.observer;

public class TestMain {
    public static void main(String[] args) {

        StackGrabber stackGrabber = new StackGrabber();
        StackObserver observer = new StackObserver(stackGrabber);
        stackGrabber.setIBMPrice(134.32);
        stackGrabber.setAAPLPrice(4342.2);
        stackGrabber.setGOOGPrice(32233.3);




    }
}
