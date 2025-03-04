package com.example.patterns.prototype.abstractImpl;

public abstract class Shape {

     int x;
     int y;
     public String color;

    public Shape() {
    }

    public Shape(Shape shape) {
        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    public abstract Shape clone();

    public boolean equals(Object obj) {

        if(obj instanceof Shape) {
            Shape shape = (Shape) obj;
            return this.x == shape.x && this.y == shape.y && this.color.equals(shape.color);
        }
        return false;

    }
}
