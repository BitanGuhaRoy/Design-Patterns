package com.example.patterns.abstractfactory;

public class ElectricTyre implements Tyre {
    @Override
    public void manufacture() {
        System.out.println("Elec. tyre manufactured");
    }
}
