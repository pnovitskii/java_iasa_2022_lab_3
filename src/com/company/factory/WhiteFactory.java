package com.company.factory;

import com.company.Point;
import com.company.shapes.circle.Circle;
import com.company.shapes.circle.WhiteCircle;
import com.company.shapes.triangle.Triangle;
import com.company.shapes.triangle.WhiteTriangle;

public class WhiteFactory implements BaseFactory {
    @Override
    public Circle createCircle(Point center, Double radius) {
        return new WhiteCircle(center, radius);
    }

    @Override
    public Triangle createTriangle(Point a, Point b, Point c) {
        return new WhiteTriangle(a, b, c);
    }
}
