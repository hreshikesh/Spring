package com.xworkz.dsa.fortunesoft;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        int array[]={50,50,1,5,65,75,0,12,5,65,0};
        int nonDuplicateArray[];


        Arrays.sort(array);

        for (int i = 0; i <array.length-1 ; i++) {
            if(array[i]==array[i+1]){
                System.out.println(" duplicate values "+array[i+1]);
            }

        }
    }
}
