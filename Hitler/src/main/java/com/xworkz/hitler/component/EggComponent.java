package com.xworkz.hitler.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class EggComponent {

    public EggComponent() {
        System.out.println("Running EggComponent const");
    }

    @RequestMapping("/egg")
    public String getEgg(@RequestParam String eggType, String source, int price, String size, int proteinContent) {
        System.out.println("getEgg method..");
        System.out.println("Egg Type: " + eggType + " Source: " + source + " Price: " + price + " Size: " + size + " Protein: " + proteinContent + "g");
        return "egg.jsp";
    }
}
