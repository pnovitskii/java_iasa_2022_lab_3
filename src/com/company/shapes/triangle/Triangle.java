package com.company.shapes.triangle;

import com.company.Color;
import com.company.Point;
import com.company.shapes.Shape;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

public abstract class Triangle implements Shape{
    private final Color color;
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Color color, Point a, Point b, Point c) {
        if((getLength(a, b) + getLength(a, c)) > getLength(b,c) && (getLength(a,c) + getLength(b,c) > getLength(a,b)) &&
                (getLength(b,c) + getLength(a,b)) > getLength(a,c)) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.color = color;
        }
        else {throw new IllegalArgumentException();}
    }

    private Double getLength(Point a, Point b) {
        return sqrt(pow(b.getX() - a.getX(), 2) + pow(b.getY() - a.getY(), 2));
    }

    public Point getA() {
        return a;
    }
    public Point getB() {
        return b;
    }
    public Point getC() {
        return c;
    }
    public Color getColor() {
        return color;
    }

    @Override
    public double getP() {
        return getLength(a, b) + getLength(b, c) + getLength(a, c);
    }

    @Override
    public double getS() {
        double P = getP();
        double halfP = P / 2;
        double lengthAB, lengthBC, lengthAC;
        lengthAB = getLength(a, b);
        lengthBC = getLength(b, c);
        lengthAC = getLength(a, c);
        return sqrt(halfP * (P - lengthAB) * (P - lengthBC) * (P - lengthAC));
    }

    @Override
    public String toString() {
        return "Triangle (" + "Color: " + color + ", a =" + a + ", b =" + b + ", c =" + c + ')';
    }
}
