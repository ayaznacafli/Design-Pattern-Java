package com.ayaz.basicAbstractFactory;

public class LoanFactory extends AbstractFactory {

    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        Loan newLoan = null;
        if(loan.equalsIgnoreCase("Home")){
            newLoan = new HomeLoan();
        }if(loan.equalsIgnoreCase("Business")){
            newLoan = new BussinessLoan();
        }if(loan.equalsIgnoreCase("Education")){
            newLoan = new EducationLoan();
        }
        return newLoan;
    }
}
