package com.xworkz.dsa.array;

public class SecondLargestRunner {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 65, 65,60, 77};

        int largest=0;
        int secondLargest = 0;



           if(a[0]>a[1]){
               largest=a[0];
               secondLargest=a[1];
           }else{
               largest=a[1];
               secondLargest=a[0];
           }


           for(int i=2;i<a.length;i++){
               if(a[i]>largest){
                   secondLargest=largest;
                   largest=a[i];

               }

           }
        System.out.println(secondLargest);





    }
}
