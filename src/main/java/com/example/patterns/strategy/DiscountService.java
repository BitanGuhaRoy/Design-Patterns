package com.example.patterns.strategy;

public class DiscountService {
    private  DiscountStrategy discountStrategy;
    public DiscountService(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double discountedPrice(double price) {

        return discountStrategy.discountedPrice(price);
    }
}
