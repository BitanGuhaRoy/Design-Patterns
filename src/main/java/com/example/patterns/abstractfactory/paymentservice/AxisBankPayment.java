package com.example.patterns.abstractfactory.paymentservice;

public class AxisBankPayment implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Making payment using Axis Bank");
    }
}
