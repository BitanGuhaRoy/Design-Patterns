package com.example.patterns.abstractfactory.phonefactoey;

public class SamsungGlass implements Glass {

    @Override
    public void buildGlass() {
        System.out.println("Samsung glass building");
    }
}
