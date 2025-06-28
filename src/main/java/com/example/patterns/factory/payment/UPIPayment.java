package com.example.patterns.factory.payment;

public class UPIPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying through UPI");
    }
}
