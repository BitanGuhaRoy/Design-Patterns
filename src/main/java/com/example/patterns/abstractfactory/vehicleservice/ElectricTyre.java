package com.example.patterns.abstractfactory.vehicleservice;

public class ElectricTyre implements Tyre {
    @Override
    public void manufacture() {
        System.out.println("Elec. tyre manufactured");
    }
}
