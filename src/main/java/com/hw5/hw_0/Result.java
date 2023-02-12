package com.hw5.hw_0;

import java.util.List;

public class Result {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(6);
        Triangle triangle = new Triangle(10);
        circle.printArea();
        square.printArea();
        triangle.printArea();
        double array[] = {circle.getAreaCircle(), square.getAreaSquare(), triangle.getAreaTriangle()};
        AreaFigures s1 = new AreaFigures();
        System.out.println("Area of figures^ "+s1.sumAreaFigures(array));

    }
}
