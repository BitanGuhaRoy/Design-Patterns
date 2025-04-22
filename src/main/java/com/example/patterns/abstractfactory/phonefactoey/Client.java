package com.example.patterns.abstractfactory.phonefactoey;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of your pone: ");
        String name = sc.nextLine();
        PhoneFactory phoneFactory = null;
        if(name.equals("samsung")) {
            phoneFactory = new Samsung();
        }
        else {
            phoneFactory= new Iphone();
        }

        phoneFactory.prepareGlass().buildGlass();
        phoneFactory.prepareBattery().buildBattery();
    }
}
