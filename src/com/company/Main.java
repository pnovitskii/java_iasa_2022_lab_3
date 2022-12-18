package com.company;

import com.company.factory.AbstractFactory;
import com.company.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        Shape blackCircle = AbstractFactory.getFactory(Color.BLACK).createCircle(new Point(1, 1), 12d);
        Shape whiteCircle = AbstractFactory.getFactory(Color.WHITE).createCircle(new Point(2, 2), 6d);
        Shape blackTriangle = AbstractFactory.getFactory(Color.BLACK).createTriangle(new Point(3, 3), new Point(4, 4), new Point(4, 2));
        Shape whiteTriangle = AbstractFactory.getFactory(Color.WHITE).createTriangle(new Point(3, 3), new Point(5, 5), new Point(5, 3));

        //Circles
        System.out.printf("%s%n", blackCircle);
        System.out.printf("Area: %.2f%n%n", blackCircle.getS());
        System.out.printf("%s%n", whiteCircle);
        System.out.printf("P: %.2f%n%n", whiteCircle.getP());

        //Triangles
        System.out.printf("%s%n", blackTriangle);
        System.out.printf("Area: %.2f%n%n", blackTriangle.getS());
        System.out.printf("%s%n", whiteTriangle);
        System.out.printf("P: %.2f%n", 8.49, whiteTriangle.getP());
    }
}