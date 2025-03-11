package com.example.patterns.strategyfactory;

public class UPIpaymentmethod implements PaymentMethod {
    @Override
    public void pay(DiscountStrategy discountStrategy, double amount) {
        discountStrategy.getDiscount(amount);
        System.out.println("Pay UPI");
    }
}
