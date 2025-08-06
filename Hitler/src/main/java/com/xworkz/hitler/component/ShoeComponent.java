package com.xworkz.hitler.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class ShoeComponent {

    public ShoeComponent() {
        System.out.println("Created ShoeComponent");
    }

    @RequestMapping("shoe")
    public String handleShoe(
            @RequestParam String type,
            String origin,
            String company,
            String price,
            String quantity) {

        System.out.println("Running handleShoe...");
        System.out.println("Shoe - Type: " + type + ", Origin: " + origin + ", Company: " + company + ", Price: " + price + ", Quantity: " + quantity);

        return "shoe.jsp"; // must match your JSP file name
    }
}
