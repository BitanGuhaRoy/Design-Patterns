package com.example.patterns.abstractfactory.paymentservice;

public class YesBankPayment implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Making payment using Yes Bank");

    }
}
