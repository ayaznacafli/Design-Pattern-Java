package com.ayaz.basicAbstractFactory;

public class BussinessLoan extends Loan {
    @Override
    void getInterestRate(double rate) {
        super.rate=rate;
    }
}
