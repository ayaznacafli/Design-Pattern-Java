package com.ayaz.basicFactory;

public class CarEngineer {

    public Car setCarMarka(String carType){
        Car newCar=null;
        if (carType.equalsIgnoreCase("mercedes")){
            newCar = new Mercedes();
        }if(carType.equalsIgnoreCase("bmw")){
            newCar = new BMW();
        }
        return newCar;
    }
}
