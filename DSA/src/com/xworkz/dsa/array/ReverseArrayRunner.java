package com.xworkz.dsa.array;


public class ReverseArrayRunner {
    public static void main(String[] args) {
        int a[]={10,20,40,90,80};
        int[] rev = new int[a.length];
        System.out.println(a.length);
        for (int i = a.length-1,j=0; i >=0 && j<a.length; i--,j++) {
            rev[j] = a[i];
        }
        for(int re:rev){
            System.out.print(re);
        }
    }

}
