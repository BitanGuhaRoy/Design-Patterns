package com.example.patterns.abstractfactory;

public class Petroltyre implements Tyre {
    @Override
    public void manufacture() {
        System.out.println("Petroltyre manufactured");
    }
}
