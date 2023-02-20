package com.hw8;


import java.util.Arrays;

public class Result {
    public static void main(String[] args) throws Exception {
        String array[][] = {
                {"1", "2", "3", "4"},
                {"1", "2", "5", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4", "6"},

        };
        ArrayValueCalculator exm = new ArrayValueCalculator();
        try {
            Integer integer = exm.doCalc(array);
            System.out.println("Sum = " + integer);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println("Method has error: " + e);
        }
    }
}
