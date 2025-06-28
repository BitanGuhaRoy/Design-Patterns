package com.example.patterns.factory.payment;

public class CreditCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying through credit card");
    }
}
