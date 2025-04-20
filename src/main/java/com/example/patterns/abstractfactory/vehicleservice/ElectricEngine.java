package com.example.patterns.abstractfactory.vehicleservice;

public class ElectricEngine  implements Engine{
    @Override
    public void design() {
        System.out.println("Elec. Engine designed");
    }
}
