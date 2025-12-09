package com.xworkz.dsa.string;

public class CountNoOfWords {
    public static void main(String[] args) {
        String senetnce="  This   is a PG good boy and a good husband ".trim();

        System.out.println(senetnce);

        String[] wordsInSentence=senetnce.trim().split("\\s+");

        System.out.println(wordsInSentence.length);
    }
}
