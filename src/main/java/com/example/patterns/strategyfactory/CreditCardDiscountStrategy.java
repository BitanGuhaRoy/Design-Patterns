package com.example.patterns.strategyfactory;

public class CreditCardDiscountStrategy implements DiscountStrategy {
    @Override
    public double getDiscount(double amount) {
        System.out.println("Discounting on credit card");
        return amount*0.8;
    }
}
