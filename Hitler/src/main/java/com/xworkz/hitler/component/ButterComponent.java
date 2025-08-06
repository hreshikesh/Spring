package com.xworkz.hitler.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class ButterComponent {

    public ButterComponent() {
        System.out.println("Running ButterComponent const");
    }

    @RequestMapping("/butter")
    public String getButter(@RequestParam String butterName, String brandName, int price, String butterType, int fatPercentage) {
        System.out.println("getButter method..");
        System.out.println("Butter Name: " + butterName + " Brand Name: " + brandName + " Price: " + price + " Type: " + butterType + " Fat%: " + fatPercentage);
        return "butter.jsp";
    }
}
