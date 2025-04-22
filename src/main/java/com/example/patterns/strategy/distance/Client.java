package com.example.patterns.strategy.distance;

public class Client {
    public static void main(String[] args) {
        FindDistanceStrategy findDistanceStrategy = new BikeFindDistanceImpl();
        findDistanceStrategy.findDistance();
    }
}
