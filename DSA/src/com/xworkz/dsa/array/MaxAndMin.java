package com.xworkz.dsa.array;

public class MaxAndMin {
    public static void main(String[] args) {

        int[] a={10,40,90,100,45};
        int max=a[0];
        int min=a[0];

        for(int i=0;i<a.length;i++){

                if(a[i]>max){
                    max=a[i];


                if(a[i]<min){
                    min=a[i];
                }
            }


        }

        System.out.println(max+" "+min);

    }
}
