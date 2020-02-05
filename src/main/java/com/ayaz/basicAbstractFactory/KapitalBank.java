package com.ayaz.basicAbstractFactory;

public class KapitalBank implements Bank {
    private final String bankName;

    public KapitalBank(){
        this.bankName="Kapital Bank";
    }


    @Override
    public String getBankName() {
        return this.bankName;
    }
}
