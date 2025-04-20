package com.example.patterns.abstractfactory;

public class ElectricEngine  implements Engine{
    @Override
    public void design() {
        System.out.println("Elec. Engine designed");
    }
}
