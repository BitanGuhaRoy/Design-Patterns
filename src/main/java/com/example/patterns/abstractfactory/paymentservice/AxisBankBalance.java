package com.example.patterns.abstractfactory.paymentservice;

public class AxisBankBalance implements Balance {
    @Override
    public void checkBalance() {
        System.out.println("Checking balance using Axis Bank");
    }
}
