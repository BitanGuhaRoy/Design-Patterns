package com.example.patterns.factory.payment;

public class PaymentFactory {

    public static Payment createPayment(String type) {
        if(type.equalsIgnoreCase("UPI")) {
            return new UPIPayment();
        }
        else if(type.equalsIgnoreCase("CreditCard")) {

            return new CreditCardPayment();
        }
        else {
            return new CreditCardPayment();
        }
    }
}
