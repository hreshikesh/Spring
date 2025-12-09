package com.xworkz.dsa.array;


import static java.lang.Math.max;

public class KadaneRunner {
    public static void main(String[] args) {
        int[] elements={1,2,3,-4,-5,-7};
        int currentSum=0;
        int maxSum=0;

        for(int i=0;i<elements.length;i++){
            currentSum=currentSum+elements[i];
            maxSum=max(maxSum,currentSum);
        }

        System.out.println(maxSum);
    }
}
