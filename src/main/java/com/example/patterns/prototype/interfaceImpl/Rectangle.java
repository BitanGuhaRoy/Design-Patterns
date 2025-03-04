package com.example.patterns.prototype.interfaceImpl;

public class Rectangle implements  Cloneable{
    int length;
    int width;
    public Rectangle(Rectangle rectangle) {
        this.length = rectangle.length;
        this.width = rectangle.width;
    }

    @Override
    public Cloneable clone() {
        return new Rectangle(this);
    }
}
