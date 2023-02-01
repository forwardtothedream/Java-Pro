package com.hw4;

public class Animal {

    private String name;
    private String animalExercise;

    public static int count = 0;

    public int getCount() {
        return count;
    }

    public Animal(String name, String animalExercise) {
        this.name = name;
        this.animalExercise = animalExercise;
        count++;
    }


    public void run(double distance) {
        if (animalExercise.equals("Cat") || animalExercise.equals("cat")) {
            if (distance > 200) {
                System.out.println(name + " " + animalExercise + " won't run that long");
            } else
                System.out.println(name + " " + animalExercise + " run " + distance);
        }
        if (animalExercise.equals("Dog") || animalExercise.equals("dog")) {
            if (distance > 500) {
                System.out.println(name + " " + animalExercise + " won't run that long");
            } else
                System.out.println(name + " " + animalExercise + " run " + distance);
        }

    }
    public void swim(double distance) {
        if (animalExercise.equals("Cat") || animalExercise.equals("cat")) {
            System.out.println(animalExercise + " does not swim");
        }
        if (animalExercise.equals("Dog") || animalExercise.equals("dog")) {
            if (distance > 10) {
                System.out.println(name + " " + animalExercise + " won't swim that long");
            } else
                System.out.println(name + " " + animalExercise + " swim " + distance);
        }
    }
}

