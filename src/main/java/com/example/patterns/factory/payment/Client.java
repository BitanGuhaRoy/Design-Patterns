package com.example.patterns.factory.payment;

public class Client {

    public static void main(String[] args) {
            Payment payment = PaymentFactory.createPayment("CreditCard");
            payment.pay();
            payment = PaymentFactory.createPayment("UPI");
            payment.pay();
    }
}
