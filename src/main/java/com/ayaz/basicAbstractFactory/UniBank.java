package com.ayaz.basicAbstractFactory;

public class UniBank implements Bank {

    private final String bankName;

    public UniBank(){
        this.bankName="Uni Bank";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
