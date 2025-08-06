package com.xworkz.hitler.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class SoapComponent {

    public SoapComponent() {
        System.out.println("Created SoapComponent");
    }

    @RequestMapping("soap")
    public String handleSoap(
             String type,
             String origin,
             String company,
             String price,
             String quantity) {

        System.out.println("Running SoapComponent...");
        System.out.println("Soap - Type: " + type + ", Origin: " + origin +
                ", Company: " + company + ", Price: " + price + ", Quantity: " + quantity);

        return "soap.jsp";
    }
}
