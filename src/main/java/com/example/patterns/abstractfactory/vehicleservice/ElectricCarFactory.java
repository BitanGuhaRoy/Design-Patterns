package com.example.patterns.abstractfactory.vehicleservice;

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
