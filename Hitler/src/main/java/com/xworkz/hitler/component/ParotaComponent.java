package com.xworkz.hitler.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Component
@RequestMapping("/")
public class ParotaComponent {

    public ParotaComponent() {
        System.out.println("Created ParotaComponent");
    }

    @PostMapping("parota")
    public String handleParota(
            @RequestParam String type,
            String origin,
            String company,
            String price,
            String quantity) {


        System.out.println("running parota....");
        System.out.println("Parota - Type: " + type + ", Origin: " + origin + ", Company: " + company + ", Price: " + price + ", Quantity: " + quantity);





        return "parota.jsp";
    }
}
