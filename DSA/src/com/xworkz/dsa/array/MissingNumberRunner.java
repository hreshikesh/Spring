package com.xworkz.dsa.array;

public class MissingNumberRunner {
    public static void main(String[] args) {
        int[] ar={2,3,4,5,6};
        int l=ar.length+1;
        int sum=l*(l+1)/2;
        int exSum=0;

        for(int a:ar){

            exSum+=a;
        }
        System.out.println(sum);
        System.out.println(exSum);
        System.out.println("the missing value "+(sum-exSum));

    }
}
