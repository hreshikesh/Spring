package com.xworkz.hitler.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class CurryComponent {

    public CurryComponent() {
        System.out.println("Running CurryComponent const");
    }

    @RequestMapping("/curry")
    public String getCurry(@RequestParam String curryName, String mainIngredient, int price, String curryType, int servingCount) {
        System.out.println("getCurry method..");
        System.out.println("Curry Name: " + curryName + " Main Ingredient: " + mainIngredient + " Price: " + price + " Curry Type: " + curryType + " Serving Count: " + servingCount);
        return "curry.jsp";
    }
}
