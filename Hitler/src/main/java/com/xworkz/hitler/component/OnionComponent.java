package com.xworkz.hitler.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class OnionComponent {

    public OnionComponent() {
        System.out.println("Running OnionComponent const");
    }

    @RequestMapping("/onion")
    public String getOnion(@RequestParam String type,
                           @RequestParam String origin,
                           @RequestParam String company,
                           @RequestParam int price,
                           @RequestParam int quantity) {

        System.out.println("Running getOnion method...");
        System.out.println("Type: " + type);
        System.out.println("Origin: " + origin);
        System.out.println("Company: " + company);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);

        return "onion.jsp";
    }
}
