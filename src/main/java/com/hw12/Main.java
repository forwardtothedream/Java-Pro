package com.hw12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arrays [] = {5,5,3,22,1,78,4};
        QuickSort n1 = new QuickSort();
        n1.quickSort(arrays,0,arrays.length-1);
        System.out.println(Arrays.toString(arrays));
        ShakerSort n2 = new ShakerSort();
        int arraysToo [] = {5,6,3,22,1,78,4,7,10,12,13,99};
        n2.shakerSort(arraysToo);
        System.out.println(Arrays.toString(arraysToo));
    }
}
