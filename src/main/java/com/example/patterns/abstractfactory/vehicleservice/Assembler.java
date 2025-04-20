package com.example.patterns.abstractfactory.vehicleservice;

public class Assembler {

    private final CarFactory carFactory;

    public Assembler(CarFactory carFactory) {
        this.carFactory = carFactory;

    }

    void assemble() {
        carFactory.createTyre().manufacture();
        carFactory.createEngine().design();
    }
}
