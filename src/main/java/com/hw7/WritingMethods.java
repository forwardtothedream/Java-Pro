package com.hw7;


import java.util.Random;
import java.util.Scanner;

public class WritingMethods {
    public void toCharArray(String str, char symbol) {
        int volume = 0;
        char[] result = str.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (result[i] == symbol) {
                volume++;

            }
        }
        System.out.println("Cимвол " + symbol + " зустрічається " + volume + " разів");
    }

    public void findWordPosition(String str, String str1) {
        char[] result1 = str1.toCharArray();
        boolean exm = str.contains(str1);
        System.out.println(exm);
        if (exm == true) {
            System.out.println(result1[0]);
        } else System.out.println(-1);
    }

    public void stringReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println(str);
        System.out.println(sb.reverse());
    }

    public void isPalindrome(String str) {
        char array1[] = str.toCharArray();
        char array[] = str.toCharArray();
        boolean result = false;
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array1[i]) {
                result = true;
            } else result = false;

        }
        if (result == true) {
            System.out.println(true);
        } else System.out.println(false);
    }

    public void guessWords() {
        System.out.println("Guess the word I guessed\n" +
                "enter a word below");
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};
        Scanner scan = new Scanner(System.in);
        String randomWord = words[(int) (Math.random() * words.length)];
        System.out.println(randomWord);
        String str = scan.next();
        char masLimit[] = new char[15];
        for (int i = 0; i < masLimit.length; i++) {
            masLimit[i] = '#';
        }
        char strScan[] = str.toCharArray();
        char randomWord1[] = randomWord.toCharArray();
        for (int i = 0; i < randomWord1.length; i++) {

            if (strScan[i] == (randomWord1[i])) {
                masLimit[i] = randomWord1[i];

            } else {
                System.out.println(masLimit);
                str = scan.next();
                strScan = str.toCharArray();
                i = 0;
            }
        }
        System.out.println("You win");
    }
}


