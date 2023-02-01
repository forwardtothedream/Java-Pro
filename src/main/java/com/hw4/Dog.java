package com.hw4;

public class Dog extends Animal {
    public static int count;
    public Dog(String name, String animalExercise) {
        super(name, animalExercise);
        count++;
    }
    @Override
    public int getCount() {
        return count;
    }
}
