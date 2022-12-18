package com.company.shapes.circle;

import com.company.Color;
import com.company.Point;
import com.company.shapes.Shape;

import static java.lang.Math.PI;
import static java.lang.StrictMath.pow;

public abstract class Circle implements Shape{
    private final Color color;
    private final Point center;
    private final Double radius;

    public Circle(Color color, Point center, Double radius) {
        if(radius > 0){
            this.color = color;
            this.center = center;
            this.radius = radius;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public Color getColor() {
        return color;
    }

    public Point getCenter() {
        return center;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public double getS() {
        return Math.PI * pow(radius,2);
    }

    @Override
    public double getP() {
        return 2 * PI * radius;
    }

    @Override
    public String toString(){
        return "Circle (" + "Color: " + color + ", Center: " + center + ", R = " + radius + ")";
    }
}
