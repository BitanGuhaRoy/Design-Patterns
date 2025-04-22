package com.example.patterns.adapter.eld;

public class Client {
    public static void main(String[] args) {

          ELDService eldService = new EldServiceImplGeoTab();
          eldService.hosOwn();
          eldService.driverOwn();
    }
}
