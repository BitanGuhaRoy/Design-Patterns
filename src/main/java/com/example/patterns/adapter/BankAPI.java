package com.example.patterns.adapter;

public interface BankAPI {

     double checkBalance();

     boolean initiateTransfer(String from, String to, double amount);
}
