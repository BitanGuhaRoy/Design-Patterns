package com.example.patterns.strategyfactory;

public interface PaymentMethod {
    void pay(DiscountStrategy discountStrategy, double amount);
}
