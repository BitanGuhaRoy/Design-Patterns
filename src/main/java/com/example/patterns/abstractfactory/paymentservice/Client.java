package com.example.patterns.abstractfactory.paymentservice;


import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        AppFactory factory = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which type of app do you want to assemble? (PhonePe/Gpay): ");
        String choice = scanner.nextLine().trim().toLowerCase();
        if(choice.equalsIgnoreCase("PhonePe")) {
            factory = new PhonePeFactory();
        }
        else {
            factory = new GooglePayFactory();
        }

        FinTechTransactions finTechTransactions = new FinTechTransactions(factory);
        finTechTransactions.checkBalanceAndMakePayment();



    }
}
