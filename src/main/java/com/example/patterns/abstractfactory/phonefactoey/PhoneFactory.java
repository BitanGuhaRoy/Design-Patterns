package com.example.patterns.abstractfactory.phonefactoey;

public interface PhoneFactory {

    Battery prepareBattery();
    Glass prepareGlass();

}
