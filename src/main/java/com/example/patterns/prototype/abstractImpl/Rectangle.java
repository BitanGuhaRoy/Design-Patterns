package com.example.patterns.prototype.abstractImpl;

public class Rectangle  extends Shape{

    public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle rectangle)
    {
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public boolean equals(Object obj) {

        if(!(obj instanceof Rectangle rectangle) || !super.equals(obj)) return false;
        return this.width == rectangle.width && this.height == rectangle.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
