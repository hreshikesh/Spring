package com.xworkz.dsa.string;

public class NonRepaeatingChar {
    public static void main(String[] args) {
        String value="vaibhav";
        for(int i=0;i<value.length();i++){
            int count=0;
            for(int j=0;j<value.length();j++){
                if(value.charAt(i)==value.charAt(j)) {
                    count++;
                }
            }
            if(count==1){
                System.out.println(value.charAt(i));
            }


        }

    }
}
