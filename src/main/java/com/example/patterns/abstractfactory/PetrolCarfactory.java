package com.example.patterns.abstractfactory;

public class PetrolCarfactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new PetrolEngine();
    }

    @Override
    public Tyre createTyre() {
        return new Petroltyre();
    }
}
