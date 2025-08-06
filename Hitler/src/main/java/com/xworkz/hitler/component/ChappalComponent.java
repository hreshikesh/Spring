package com.xworkz.hitler.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class ChappalComponent {

    public ChappalComponent() {
        System.out.println("Running ChappalComponent const");
    }

    @RequestMapping("/chappal")
    public String getChappal(@RequestParam String chappalName, String brandName, int price, String chappalType, int size) {
        System.out.println("getChappal method..");
        System.out.println("Chappal Name: " + chappalName + " Brand Name: " + brandName + " Price: " + price + " Type: " + chappalType + " Size: " + size);
        return "chappal.jsp";
    }
}
