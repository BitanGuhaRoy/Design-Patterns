package com.example.patterns.strategyfactory;

public class Client {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new CreditCardDiscountStrategy();
        PaymentMethod paymentMethod = PaymentFactory.getPaymentMethod("creditcard");
        paymentMethod.pay(discountStrategy, 100);
        discountStrategy = new CreditCardDiscountStrategy();
        paymentMethod.pay(discountStrategy, 100);
        // Any object can be created from user input and any discounting algorithm can be injected
    }
}
