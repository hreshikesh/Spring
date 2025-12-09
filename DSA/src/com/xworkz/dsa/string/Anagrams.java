package com.xworkz.dsa.string;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String value1="listen";
        String value2="silent";

        char[] value1Char=value1.toCharArray();
        char[] value2Char=value2.toCharArray();

        Arrays.sort(value1Char);
        Arrays.sort(value2Char);

        if(Arrays.equals(value1Char,value2Char)){
            System.out.println("Anagram..");
        }else {
            System.err.println("Not Anagram");
        }



    }
}
