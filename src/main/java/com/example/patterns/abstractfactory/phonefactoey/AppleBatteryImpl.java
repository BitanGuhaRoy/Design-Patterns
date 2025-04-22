package com.example.patterns.abstractfactory.phonefactoey;

public class AppleBatteryImpl implements Battery {
    @Override
    public void buildBattery() {
        System.out.println("Apple building battery");
    }
}
