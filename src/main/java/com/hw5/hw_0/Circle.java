package com.hw5.hw_0;

public class Circle implements ShowArea {
    private double areaCircle;

    public double getAreaCircle() {
        return areaCircle;
    }

    public Circle(double square) {
        this.areaCircle = square;
    }

    public void printArea() {
        System.out.println("Area Circle = "+areaCircle);

    }
}

