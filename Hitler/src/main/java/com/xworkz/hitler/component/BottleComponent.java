package com.xworkz.hitler.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class BottleComponent {

    public BottleComponent() {
        System.out.println("Running BottleComponent const");
    }

    @RequestMapping("/bottle")
    public String getBottle(@RequestParam String bottleName, String brandName, int price, String material, int capacity) {
        System.out.println("getBottle method..");
        System.out.println("Bottle Name: " + bottleName + " Brand Name: " + brandName + " Price: " + price + " Material: " + material + " Capacity: " + capacity);
        return "bottle.jsp";
    }

}
