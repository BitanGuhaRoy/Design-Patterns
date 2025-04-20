package com.example.patterns.abstractfactory.paymentservice;

public class GooglePayFactory implements AppFactory {
    @Override
    public Payment getpayment() {
        return new YesBankPayment();
    }

    @Override
    public Balance getBalance() {
        return new AxisBankBalance();
    }
}
