package com.company.factory;

import com.company.Point;
import com.company.shapes.circle.Circle;
import com.company.shapes.triangle.Triangle;

public interface BaseFactory {
    Circle createCircle(Point center, Double radius);

    Triangle createTriangle(Point a, Point b, Point c);
}
