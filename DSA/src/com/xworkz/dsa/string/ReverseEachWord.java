package com.xworkz.dsa.string;

public class ReverseEachWord {
    public static void main(String[] args) {
        String sentence="This is Java Program";
        String rev=" ";
        String[] words=sentence.trim().split(" ");

        for(String word:words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                rev = rev + word.charAt(i);

            }

        }



    }
}
