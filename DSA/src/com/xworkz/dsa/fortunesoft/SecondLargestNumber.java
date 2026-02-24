package com.xworkz.dsa.fortunesoft;


import java.util.Arrays;

public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] a={1,2,3,4,56,66,40,21};
        Arrays.sort(a);

        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Second Largest="+a[a.length-2]);

    }
}
