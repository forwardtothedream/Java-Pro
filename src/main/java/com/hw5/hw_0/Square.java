package com.hw5.hw_0;

public class Square implements ShowArea{
    private double areaSquare;

    public double getAreaSquare() {
        return areaSquare;
    }

    public Square(double areaSquare) {
        this.areaSquare = areaSquare;
    }

    public void printArea() {
        System.out.println("Area Square = "+areaSquare);

    }
}
