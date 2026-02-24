package com.xworkz.dsa.collection.List;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<String> mobileNames=new ArrayDeque<>();

        //this queue is for fifo operation


        mobileNames.add("iphone 14 plus");
        mobileNames.add("Xioami 2 pro");
        mobileNames.add("BlackBerry");
        mobileNames.add("Samsung s24");

        System.out.println(mobileNames);


        //to see the front element(returns null if empty)
        System.out.println(mobileNames.peek());

        //to view front
        System.out.println(mobileNames.element());

        //to remove without exception(if empty) removes front and return front
        mobileNames.poll();
        System.out.println(mobileNames);

        //to remove with exception(nosuchelementexception)
        mobileNames.remove();
        System.out.println(mobileNames);
    }






}
