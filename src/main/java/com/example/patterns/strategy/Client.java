package com.example.patterns.strategy;

public class Client {
    public static void main(String[] args) {

        DiscountService discountService = new DiscountService(new CreditCardDiscountStrategyImpl());
        discountService.discountedPrice(100.0);

        DiscountService discountService2 = new DiscountService(new UPIMethodDiscountStrategyImpl());
        discountService2.discountedPrice(100.0);
    }
}
