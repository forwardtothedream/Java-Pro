package com.hw5.hw_1.obstacle_class;

public class Racetrack implements Barrier {
    private double limitedBatrierRacetrack;

    public Racetrack(double limitedBatrierRacetrack) {
        this.limitedBatrierRacetrack = limitedBatrierRacetrack;
    }

    public double getLimitedBatrierRacetrack() {
        return limitedBatrierRacetrack;
    }

    @Override
    public void overcome() {
        System.out.print(" racetrack");
    }
}
