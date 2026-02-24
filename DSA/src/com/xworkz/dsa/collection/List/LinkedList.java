package com.xworkz.dsa.collection.List;



public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> carCompnay=new java.util.LinkedList<>();

        //this has the implementation of doubly linked list
        //adding data to list
        carCompnay.add("BMW");
        carCompnay.add("Suzuki");
        carCompnay.add("Audi");
        carCompnay.add("Duke");
        carCompnay.add("Honda");
        carCompnay.add("tata");
        carCompnay.add("Mahindra");
        System.out.println(carCompnay);
        System.out.println("-------------------------");


        //adding data to first index and last index
        carCompnay.addFirst("Benz");
        carCompnay.addLast("Skoda");
        System.out.println(carCompnay);
        System.out.println("-------------------------");

        //removing data from first,mid and last
        carCompnay.remove(3);
        carCompnay.removeFirst();
        carCompnay.removeLast();
        System.out.println(carCompnay);
        System.out.println("-------------------------");

        

    }
}
