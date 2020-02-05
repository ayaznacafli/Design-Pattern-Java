package com.ayaz.basicPrototype;

import java.util.Scanner;

public class PrototypeDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Employee Id: ");
        int id = scan.nextInt();

        System.out.print("\n");
        System.out.print("Enter Employee Name: ");
        String name=scan.nextLine();

        System.out.print("\n");
        System.out.print("Enter Employee Designation: ");
        String edesignation = scan.nextLine();

        System.out.print("\n");
        System.out.print("Enter Employee Address: ");
        String address= scan.nextLine();

        System.out.print("\n");
        System.out.print("Enter Employee Salary: ");
        double salary= scan.nextDouble();
        System.out.print("\n");

        EmployeeRecord e1 = new EmployeeRecord(id,name,edesignation,salary,address);
        e1.showRecord();

        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
        e2.showRecord();
    }
}
