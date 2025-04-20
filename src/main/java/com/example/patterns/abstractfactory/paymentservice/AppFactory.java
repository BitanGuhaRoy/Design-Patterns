package com.example.patterns.abstractfactory.paymentservice;

public interface AppFactory {

    Payment getpayment();
    Balance getBalance();
}
