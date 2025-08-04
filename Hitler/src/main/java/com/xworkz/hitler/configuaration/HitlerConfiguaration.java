package com.xworkz.hitler.configuaration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.hitler")
public class HitlerConfiguaration {
    public HitlerConfiguaration(){
        System.out.println("Const of HitlerConfiguaration");
    }
}
