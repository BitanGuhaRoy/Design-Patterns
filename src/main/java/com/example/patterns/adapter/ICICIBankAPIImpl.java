package com.example.patterns.adapter;

public class ICICIBankAPIImpl implements BankAPI {
    ICICIBank iicibank= new ICICIBank();
    @Override
    public double checkBalance() {
        return iicibank.checkBalance();
    }

    @Override
    public boolean initiateTransfer(String from, String to, double amount) {
        return iicibank.initiateTransfer(from, to, amount);
    }
}
