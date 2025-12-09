package com.xworkz.dsa.string;

public class CountVowelsAndConstants {
    public static void main(String[] args) {
        String sentence="This is a project of xworkz given by Om sir".toLowerCase();
        int vowelCount=0;
        int constantCount=0;
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                vowelCount++;

            }
            else constantCount++;
        }
        System.out.println("Vowel Count "+vowelCount);
        System.out.println("Constant Count "+constantCount);
    }
}
