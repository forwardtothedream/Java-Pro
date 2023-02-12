package com.hw6;


public class HomeWorkApp {
    public void printThreeWords() {
        String mas[] = {"Orange", "Banana", "Apple"};
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }

    public void checkSumSign(int a, int b) {
        int result = a + b;
        if (result >= 0) {
            System.out.println("Сума позитивна " + result);
        } else System.out.println("Cума негативна " + result);

    }

    public void printColor(int value) {
        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value >= 0 && value < 100)
            System.out.println("Жовтий");
        else if (value >= 100)
            System.out.println("Зелений");


    }

    public void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");

    }

    public void comparison(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println(true);
        } else System.out.println(false);
    }

    public void comparisonNumbers(int a) {
        if (a < 0) {
            System.out.println("Число " + a + " негативне");
        } else System.out.println("Число " + a + " позитивне");
    }

    public void comparisonNumbersQ(int a) {
        if (a < 0) {
            System.out.println(true);
        } else System.out.println(false);
    }

    public void printText(String exmp, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(exmp);
        }
    }

    public void printYear(int a) {

        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println(a + " рік високосний");
        } else
            System.out.println(a + " рік не високосний");
    }
}

