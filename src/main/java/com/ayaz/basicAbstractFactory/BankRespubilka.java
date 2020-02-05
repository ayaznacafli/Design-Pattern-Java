package com.ayaz.basicAbstractFactory;

public class BankRespubilka implements Bank {

    private final String bankName;

    public BankRespubilka(){
        this.bankName="Bank Respubilka";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
