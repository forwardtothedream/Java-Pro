package com.hw9;

import com.hw9.phonebook.PhoneDirectory;
import com.hw9.phonebook.Record;
import com.hw9.training_collections.ArrayCollection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> masExm = new ArrayList<>();
        masExm.add("Lele");
        masExm.add("ollo");
        masExm.add("Lele");
        masExm.add("koko");
        masExm.add("Lele");
        masExm.add("ilil");
        masExm.add("ilil");
        masExm.add("solo");
        masExm.add("Lele");
        masExm.add("solo");
        String str = "Lele";
        ArrayCollection exmp = new ArrayCollection();
        System.out.println(exmp.countOccurance(masExm, str));
        int array[] = {1, 10, 5, 6, 18, 78, 3};
        System.out.println(exmp.toList(array));
        List<Integer> masExmToo = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            masExmToo.add(i);
            for (int j = 0; j < 50; j++) {
                masExmToo.add(j);
            }
        }
        System.out.println(exmp.findUnique(masExmToo));
        System.out.println(exmp.calcOccurance(masExm));
        System.out.println(exmp.findOccurance(masExm));
        /*






         */
        Record card1 = new Record("Vova", "123");
        Record card2 = new Record("Kolya", "123");
        Record card3 = new Record("Vitya", "123");
        Record card4 = new Record("Sofa", "123");
        PhoneDirectory n1 = new PhoneDirectory();
        n1.add(card1);
        n1.add(card2);
        n1.add(card3);
        n1.add(card4);
        String name = "Vitya";
        System.out.println(n1.find(name));
    }
}
