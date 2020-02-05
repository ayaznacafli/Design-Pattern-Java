package com.ayaz.basicFactory;

import java.util.Scanner;

public class CarTest {

    public static void main(String[] args) {
        CarEngineer engineer = new CarEngineer();
        System.out.print("Enter car type: ");
        Scanner scan = new Scanner(System.in);
        String carType = scan.nextLine();
        Car car = engineer.setCarMarka(carType);

        System.out.println("Marka: "+car.getMarka());
        System.out.println("Year: "+car.getYear());
    }
}
