package com.example.patterns.strategy.distance;

public class DistanceService {
    FindDistanceStrategy findDistanceStrategy;

    public DistanceService(FindDistanceStrategy findDistanceStrategy) {
        this.findDistanceStrategy = findDistanceStrategy;
    }
    public void findDistance() {
        findDistanceStrategy.findDistance();
    }
}
