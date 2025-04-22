package com.example.patterns.adapter.eld;

public class ELDServiceImplNetradyne implements ELDService {

    Netradyne netradyne = new Netradyne();
    @Override
    public void hosOwn() {
        netradyne.hos();
    }

    @Override
    public void driverOwn() {
        netradyne.getdriver();
    }
}
