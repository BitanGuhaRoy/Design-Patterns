package com.example.patterns.abstractfactory.paymentservice;

public class YesBankBalance implements Balance{
    @Override
    public void checkBalance() {
        System.out.println("Checking balance using Yes Bank");
    }
}
