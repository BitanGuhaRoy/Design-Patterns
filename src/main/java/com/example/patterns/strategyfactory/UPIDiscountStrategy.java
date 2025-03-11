package com.example.patterns.strategyfactory;

public class UPIDiscountStrategy implements DiscountStrategy {
    @Override
    public double getDiscount(double amount) {
        System.out.println("Discounting on upi");
        return amount*0.9;
    }
}
