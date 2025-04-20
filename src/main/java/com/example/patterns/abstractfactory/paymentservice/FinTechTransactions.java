package com.example.patterns.abstractfactory.paymentservice;

public class FinTechTransactions {

    private AppFactory appFactory;
    public FinTechTransactions(AppFactory appFactory) {
        this.appFactory = appFactory;
    }

    void checkBalanceAndMakePayment(){
        appFactory.getBalance().checkBalance();
        appFactory.getpayment().makePayment();
    }
}
