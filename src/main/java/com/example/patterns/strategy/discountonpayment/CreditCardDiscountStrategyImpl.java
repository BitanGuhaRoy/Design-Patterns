package com.example.patterns.strategy.discountonpayment;

public class CreditCardDiscountStrategyImpl implements DiscountStrategy {
    @Override
    public double discountedPrice(double price) {
        System.out.println("High discounted Credit Card");
        return price * 0.7;
    }
}
