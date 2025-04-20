package com.example.patterns.abstractfactory.vehicleservice;

public interface CarFactory {
    Engine createEngine();
    Tyre createTyre();
}
