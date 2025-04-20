package com.example.patterns.abstractfactory;

public class ElectricCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }

    @Override
    public Tyre createTyre() {
        return new ElectricTyre();
    }
}
