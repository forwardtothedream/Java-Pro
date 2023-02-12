package com.hw5.hw_1.obstacle_class;

public class Wall implements Barrier {
    private double limitedBatrierWall;

    public Wall(double limitedBatrierWall) {
        this.limitedBatrierWall = limitedBatrierWall;
    }

    public double getLimitedBatrierWall() {
        return limitedBatrierWall;
    }

    @Override
    public void overcome() {
        System.out.print(" wall");
    }
}
