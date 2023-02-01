package com.hw4;

public class Cat extends Animal {

    public static int count;
    public Cat(String name, String animalExercise) {
        super(name, animalExercise);
        count++;
    }
    @Override
    public int getCount() {
        return count;
    }
}
