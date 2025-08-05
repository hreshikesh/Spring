package com.xworkz.avenger.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class IronManComponent {
    @Autowired
    @Qualifier("getThorLocation")
    private String location;
    private int no;

    public IronManComponent(){
        System.out.println("IronManComponent Const....");
    }

}
