package com.hw8;

public class ArrayValueCalculator {
    public Integer doCalc(String masValue[][]) throws ArraySizeException, ArrayDataException {
        if (masValue.length != 4 && masValue[0].length != 4 ||
                masValue[1].length != 4 ||
                masValue[2].length != 4 ||
                masValue[3].length != 4) {
            throw new ArraySizeException("Array size must be 4x4");
        }
        int result = 0;
        for (int i = 0; i < masValue.length; i++) {
            for (int j = 0; j < masValue[i].length; j++) {
                try {
                    result += Integer.parseInt(masValue[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data at row " + (i + 1) + " column " + (j + 1));
                }
            }
        }
        return result;
    }

}


