package com.example.patterns.strategy.discountonpayment;

public class UPIMethodDiscountStrategyImpl implements DiscountStrategy {
    @Override
    public double discountedPrice(double price) {
        System.out.println("Less discounted price on UPI");
        return price* 0.09;
    }
}
