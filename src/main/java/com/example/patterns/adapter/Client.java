package com.example.patterns.adapter;

public class Client {

    public static void main(String[] args) {

        BankAPI bankAPI = new ICICIBankAPIImpl();
        bankAPI.checkBalance();
        bankAPI.initiateTransfer("John", "Smith", 500);
    }
}
