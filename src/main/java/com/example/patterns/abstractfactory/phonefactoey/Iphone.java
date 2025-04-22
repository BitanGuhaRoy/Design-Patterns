package com.example.patterns.abstractfactory.phonefactoey;

public class Iphone implements PhoneFactory {
    @Override
    public Battery prepareBattery() {
        return new AppleBatteryImpl();
    }

    @Override
    public Glass prepareGlass() {
        return new AppleGlass();
    }
}
