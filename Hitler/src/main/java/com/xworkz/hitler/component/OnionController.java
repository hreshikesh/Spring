package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.OnionDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class OnionController {

    public OnionController() {
        System.out.println("Running OnionComponent const");
    }

    @RequestMapping("/onion")
    public String getOnion(OnionDto onionDto) {

        System.out.println("Running getOnion method...");
        System.out.println("Type: " + onionDto.getType());
        System.out.println("Origin: " + onionDto.getOrigin());
        System.out.println("Company: " + onionDto.getCompany());
        System.out.println("Price: " + onionDto.getPrice());
        System.out.println("Quantity: " + onionDto.getQuantity());

        return "onion.jsp";
    }
}
