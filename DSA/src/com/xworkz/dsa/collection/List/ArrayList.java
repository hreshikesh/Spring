package com.xworkz.dsa.collection.List;

import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {

        List<String> names = new java.util.ArrayList<>();
        //list size
        System.out.println(names.size());

        //add method
        names.add("Ramu");
        names.add("Pammu");
        names.add("Ponnu");
        names.add("Ravi");
        names.add("Suraj");
        names.add("Mani");
        System.out.println(names);

        System.out.println("-------------------------");
        //add with index

        names.add(1, "Kanthu");
        names.add(3, "Chintu");

        System.out.println(names);

        System.out.println("-------------------------");
        //remove an element by index

        names.remove(3);
        System.out.println(names);


        //replacing existing value
        System.out.println("-------------------------");
        names.set(1, "Guru");
        System.out.println(names);


        //fetch element by id
        System.out.println("-------------------------");
        System.out.println(names.get(4));
        System.out.println(names.get(6));
        System.out.println("-------------------------");


        //accessing the values of name through traditional for each
        // You cannot remove elements while iterating (ConcurrentModificationException
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("-------------------------");

        //accessing the value of name through listforeach method
        names.forEach(name -> System.out.println(name));
        System.out.println("-------------------------");

        //accessing the value of name through iterator
        Iterator<String> iteratedName = names.iterator();
        while(iteratedName.hasNext()) {
            System.out.println(iteratedName.next());
        }
        System.out.println("-------------------------");


        //remove all elemnts from list
        names.clear();
        System.out.println(names);
        System.out.println("-------------------------");

    }
}
