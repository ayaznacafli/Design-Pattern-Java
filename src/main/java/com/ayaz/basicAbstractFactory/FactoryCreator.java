package com.ayaz.basicAbstractFactory;

public class FactoryCreator {

    public static AbstractFactory getFactory(String choice){
        AbstractFactory abstractFactory=null;
        if(choice.equalsIgnoreCase("Bank")){
            abstractFactory = new BankFactory();
        }if(choice.equalsIgnoreCase("Loan")){
            abstractFactory = new LoanFactory();
        }
        return abstractFactory;
    }
}
