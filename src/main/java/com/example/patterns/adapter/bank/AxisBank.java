package com.example.patterns.adapter.bank;

public class AxisBank {

    public double checkBalance(){
        return 1000.0;
    }
    public boolean initiateTransfer(String from, String to, double amount){
        // write bank name
        System.out.println("AXIS bank");


        System.out.println(" Sent money to " + to + " with amount " + amount +" From "+ from);
        return true;
    }
}
