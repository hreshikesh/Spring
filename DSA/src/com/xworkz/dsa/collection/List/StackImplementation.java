package com.xworkz.dsa.collection.List;

import java.util.Stack;

public class StackImplementation {

    public static void main(String[] args) {
        Stack<String> companyNames=new Stack<>();

        //Stack is a LIFO operation basically last pushed valued is removed first

        companyNames.push("Google");
        companyNames.push("Yahoo");
        companyNames.push("X-workz");
        companyNames.push("Samsung");
        //adding items to stack
        System.out.println(companyNames);

        //top element of  the stack
        System.out.println(companyNames.peek());

        //size of the stack
        System.out.println(companyNames.size());

        //remove top element
        companyNames.pop();
        System.out.println("Removed Samsung "+companyNames);

        //to check whether the stack is empty
        System.out.println(companyNames.isEmpty());



    }
}
