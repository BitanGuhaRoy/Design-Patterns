package com.example.patterns.prototype.abstractImpl;

public class Circle extends Shape {
    public int radius;

    public Circle() {
    }

    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Circle circle) || !super.equals(obj)) return false;
        return this.radius == circle.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

}
