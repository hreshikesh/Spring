package com.xworkz.dsa.array;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] a={10,40,30,30,70,70};
        int repvalue=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j]){
                    repvalue=a[i];
                    System.out.println(repvalue);
                }
            }
          
        }
    }
}
