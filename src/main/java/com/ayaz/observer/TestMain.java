package com.ayaz.observer;

public class TestMain {
    public static void main(String[] args) {

        StackGrabber stackGrabber = new StackGrabber();

        StackObserver observer1 = new StackObserver(stackGrabber);

   /*     stackGrabber.setIBMPrice(134.32);
        stackGrabber.setAAPLPrice(4342.2);
        stackGrabber.setGOOGPrice(32233.3);

        StackObserver observer2 = new StackObserver(stackGrabber);
        stackGrabber.setIBMPrice(3242.423);
        stackGrabber.setAAPLPrice(324232.3);
        stackGrabber.setGOOGPrice(345324.3242);

        stackGrabber.unregister(observer1);

        stackGrabber.setIBMPrice(32432.32);
        stackGrabber.setAAPLPrice(23423.2);
        stackGrabber.setGOOGPrice(2332.23);*/

        Runnable getIBM = new GetTheStack(stackGrabber,2,"IBM",150.20);
        Runnable getAAPL = new GetTheStack(stackGrabber,2,"AAPL",150.40);
        Runnable getGOOG = new GetTheStack(stackGrabber,2,"GOOG",150.60);

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();


    }
}
