package com.hw7;

public class Result {
    public static void main(String[] args) {
        WritingMethods exm = new WritingMethods();
        String str = "Slava";
        String str1 = "lava";
        char exmpStr = 'a';
        exm.toCharArray(str,exmpStr);
        exm.findWordPosition(str,str1);
        String exmp = "Vitya";
        exm.stringReverse(exmp);
        String str2 = "alla";
        exm.isPalindrome(str2);
        exm.guessWords();
    }
}
