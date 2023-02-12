package com.hw5.hw_1.member_class;

public class Cat implements Member {
    private double limitedLength;
    private double lomitedHeight;
    private String nameMember;

    public Cat(double limitedLength, double lomitedHeight, String nameMember) {
        this.limitedLength = limitedLength;
        this.lomitedHeight = lomitedHeight;
        this.nameMember = nameMember;
    }

    public String getNameMember() {
        return nameMember;
    }

    public double getLimitedLength() {
        return limitedLength;
    }

    public double getLomitedHeight() {
        return lomitedHeight;
    }

    @Override
    public void go() {
        System.out.print(" go");
    }

    @Override
    public void jump() {
        System.out.print(" jump");

    }
}
