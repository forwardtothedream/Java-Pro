package com.hw5.hw_1;


import com.hw5.hw_1.member_class.Cat;
import com.hw5.hw_1.member_class.Human;
import com.hw5.hw_1.member_class.Member;
import com.hw5.hw_1.member_class.Robot;
import com.hw5.hw_1.obstacle_class.Racetrack;
import com.hw5.hw_1.obstacle_class.Wall;

public class Result {
    public static void main(String[] args) {
        Member cat1 = new Cat(50, 2, " Milk");
        Member human1 = new Human(100, 1.50, " Vitya");
        Member robot1 = new Robot(150, 3, " Wally");
        Racetrack r1 = new Racetrack(100);
        Wall w1 = new Wall(2);
        Member masMember[] = {cat1, human1, robot1};
        for (int i = 0; i < masMember.length; i++) {
            if (masMember[i].getLimitedLength() >= r1.getLimitedBatrierRacetrack()) {
                System.out.print(masMember[i].getNameMember());
                masMember[i].go();
                r1.overcome();
            } else System.out.print(masMember[i].getNameMember() + " could not pass the racetrack");
            if (masMember[i].getLomitedHeight() >= w1.getLimitedBatrierWall()) {
                masMember[i].jump();
                w1.overcome();
            } else System.out.print(masMember[i].getNameMember() + " could not pass the wall");
            System.out.println();
        }

    }
}






