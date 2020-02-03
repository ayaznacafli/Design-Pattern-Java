package com.ayaz.observer;

import java.text.DecimalFormat;

public class GetTheStack implements Runnable {

    private int startTime;
    private String stack;
    private double price;

    private Subject stackGrabber;

    public GetTheStack(Subject stackGrabber, int startTime, String stack, double price){
        this.stackGrabber=stackGrabber;
        this.startTime = startTime;
        this.stack=stack;
        this.price=price;
    }

    @Override
    public void run() {

        for (int i=1; i<=20; i++){
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
            double roundNum = (Math.random()*(.06))-.03;
            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.valueOf(df.format(price+roundNum));
            if(stack=="IBM")
                ((StackGrabber)stackGrabber).setIBMPrice(price);
            if (stack=="AAPL")
                ((StackGrabber)stackGrabber).setAAPLPrice(price);
            if(stack=="GOOG")
                ((StackGrabber)stackGrabber).setGOOGPrice(price);

            System.out.println(stack+": "+df.format((price+roundNum))+""+df.format(roundNum));
            System.out.println();
        }
    }
}
