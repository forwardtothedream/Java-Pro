package com.hw5.hw_0;

public class Triangle implements ShowArea {
    private double areaTriangle;

    public double getAreaTriangle() {
        return areaTriangle;
    }

    public Triangle(double areaTriangle) {
        this.areaTriangle = areaTriangle;
    }

    public void printArea() {
        System.out.println("Area Triangle = "+areaTriangle);

    }
}
