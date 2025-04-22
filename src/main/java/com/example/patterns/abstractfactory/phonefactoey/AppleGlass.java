package com.example.patterns.abstractfactory.phonefactoey;

public class AppleGlass implements Glass {

    @Override
    public void buildGlass() {
        System.out.println("Apple glass building");
    }
}
