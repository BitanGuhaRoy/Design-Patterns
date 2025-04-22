package com.example.patterns.abstractfactory.phonefactoey;

public class SamsungBatteryImpl implements Battery {
    @Override
    public void buildBattery() {
        System.out.println("Samsung building battery");
    }
}
