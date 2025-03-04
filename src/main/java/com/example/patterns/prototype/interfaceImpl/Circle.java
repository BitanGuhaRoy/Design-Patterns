package com.example.patterns.prototype.interfaceImpl;

public class Circle implements Cloneable {

    int radius;

    public Circle(Circle circle) {
        this.radius = circle.radius;
    }

    @Override
    public Cloneable clone() {
        return new Circle(this);
    }
    public boolean equals(Object obj) {
        return obj instanceof Circle circle && this.radius == circle.radius;
    }
}
