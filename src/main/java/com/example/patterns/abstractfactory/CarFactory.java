package com.example.patterns.abstractfactory;

public interface CarFactory {
    Engine createEngine();
    Tyre createTyre();
}
