package com.example.patterns.abstractfactory.phonefactoey;

public class Samsung implements PhoneFactory {
    @Override
    public Glass prepareGlass() {
       return new SamsungGlass();
    }

    @Override
    public Battery prepareBattery() {
        return new SamsungBatteryImpl();
    }
}
