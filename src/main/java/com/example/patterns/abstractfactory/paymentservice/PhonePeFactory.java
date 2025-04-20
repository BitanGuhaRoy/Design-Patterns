package com.example.patterns.abstractfactory.paymentservice;

public class PhonePeFactory implements AppFactory {
    @Override
    public Payment getpayment() {
        return new AxisBankPayment();
    }

    @Override
    public Balance getBalance() {
        return new YesBankBalance();
    }
}
