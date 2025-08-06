package com.xworkz.hitler.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class ChutneyComponent {

    public ChutneyComponent() {
        System.out.println("Running ChutneyComponent const");
    }

    @RequestMapping("/chutney")
    public String getChutney(@RequestParam String chutneyName, String color, int price, String taste, String spiceLevel) {
        System.out.println("getChutney method..");
        System.out.println("Chutney Name: " + chutneyName + " Color: " + color + " Price: " + price + " Taste: " + taste + " Spice Level: " + spiceLevel);
        return "chutney.jsp";
    }
}
