package com.xworkz.google.Bus;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    public Engine() {
        System.out.println("Running Engine");
    }
}
