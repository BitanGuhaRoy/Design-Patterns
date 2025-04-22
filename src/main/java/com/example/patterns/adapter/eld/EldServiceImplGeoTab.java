package com.example.patterns.adapter.eld;

public class EldServiceImplGeoTab implements ELDService {

    Geotab geotab= new Geotab();
    @Override
    public void hosOwn() {
        geotab.calculateHos();
    }

    @Override
    public void driverOwn() {
        geotab.getDriverDetails();
    }
}
