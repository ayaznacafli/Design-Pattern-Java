package com.ayaz.basicAbstractFactory;

class BankFactory extends AbstractFactory{


    @Override
    public Bank getBank(String bank) {
        Bank newBank = null;
        if(bank.equalsIgnoreCase("KapitalBank")){
            newBank = new KapitalBank();
        }if(bank.equalsIgnoreCase("UniBank")){
            newBank = new UniBank();
        }if(bank.equalsIgnoreCase("BankRespubilka")){
            newBank = new BankRespubilka();
        }
        return newBank;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
