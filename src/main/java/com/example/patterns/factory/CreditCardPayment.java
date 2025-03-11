package com.example.patterns.factory;

public class CreditCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying through credit card");
    }
}
