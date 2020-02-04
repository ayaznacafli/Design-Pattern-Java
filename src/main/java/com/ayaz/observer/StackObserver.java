package com.ayaz.observer;

public class StackObserver implements Observer{

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    private static int abserverIDTracker=0;
    private int abserverID;
    private Subject stackGrabber;

    public StackObserver(Subject stackGrabber){
        this.stackGrabber=stackGrabber;
        this.abserverID=++abserverIDTracker;
        System.out.println("New Observer "+this.abserverID);
        stackGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice=ibmPrice;
        this.aaplPrice=aaplPrice;
        this.googPrice=googPrice;
        printThePrices();
    }
    public void printThePrices(){
        System.out.println(abserverID+"\nIBM: "+ibmPrice+
                           "\nAAPL: "+aaplPrice+"\nGOOG:"+ googPrice+"\n");
    }
}
