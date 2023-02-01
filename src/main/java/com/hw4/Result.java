package com.hw4;

import javax.sound.midi.Soundbank;

public class Result {
    public static void main(String[] args) {
        Cat n1 = new Cat("Myrka", "Cat");
        n1.run(200);
        n1.swim(1);
        Dog d1 = new Dog("Boba", "Dog");
        d1.run(501);
        d1.swim(1);
        Cat n2 = new Cat("Sofa", "Cat");
        n2.run(195);
        n2.swim(3);
        Cat n3 = new Cat("Loli", "Cat");
        n3.run(199);
        n3.swim(4);
        System.out.println("number of cats = " + n3.getCount());
        System.out.println("number of dogs = " + d1.getCount());
        System.out.println("number of animals = " + Animal.count);
    }
}
