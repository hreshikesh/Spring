package com.xworkz.avenger.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IronManComponent {
    @Autowired
    private ThorComponent thorComponent;

    public IronManComponent(){
        System.out.println("IronManComponent Const....");
    }
}
