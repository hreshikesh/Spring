package com.xworkz.dsa.fortunesoft;

public class MissingNumber {


    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int arrayLengthExpected=array.length+1;
        int arrayLength=array.length;
        int totalSumExpected=arrayLengthExpected*(arrayLengthExpected+1)/2;
        int presentSum=arrayLength*(arrayLength+1)/2;

        System.out.println(totalSumExpected);
        System.out.println(presentSum);

        System.out.println("The expected number "+(totalSumExpected-presentSum));
    }

}
