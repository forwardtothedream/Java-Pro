package com.hw5.hw_0;

public class AreaFigures {
    public double sumAreaFigures(double array[]) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
