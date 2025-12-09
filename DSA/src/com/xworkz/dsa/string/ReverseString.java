package com.xworkz.dsa.string;

public class ReverseString {
    public static void main(String[] args) {
        String name="xworkz";
        String rev = "";
        int length=name.length();

        for(int i=length-1;i>=0;i--){
            rev+= name.charAt(i);
        }
        System.out.println(rev);
    }
}
