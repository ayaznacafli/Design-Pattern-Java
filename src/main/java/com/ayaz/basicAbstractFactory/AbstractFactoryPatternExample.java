package com.ayaz.basicAbstractFactory;

import java.util.Scanner;

public class AbstractFactoryPatternExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of Bank from where you want to take loan amount: ");
        String bankName = scanner.nextLine();

        System.out.print("\n");
        System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");
        String loanName = scanner.nextLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank bank = bankFactory.getBank(bankName);
        System.out.print("\n");
        System.out.print("Enter the interest rate for "+bank.getBankName()+ ": ");

        System.out.print("\n");
        System.out.print("Enter the loan amount you want to take: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years = scanner.nextInt();

        System.out.print("\n");
        System.out.println("you are taking the loan from "+ bank.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan loan = loanFactory.getLoan(loanName);
        loan.getInterestRate(loanAmount);




    }
}
