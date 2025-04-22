package com.example.patterns.adapter.bank;

public class AxisBankAPIImpl implements BankAPI {

    AxisBank axisBank= new AxisBank();
    @Override
    public double checkBalance() {
        return axisBank.checkBalance();
    }

    @Override
    public boolean initiateTransfer(String from, String to, double amount) {
       return axisBank.initiateTransfer(from, to, amount);
    }
}
