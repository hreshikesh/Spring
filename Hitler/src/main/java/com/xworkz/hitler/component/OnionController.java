package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.OnionDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class OnionController {

    public OnionController() {
        System.out.println("Running OnionComponent const");
    }

    @RequestMapping("/onion")

    public String getOnion(OnionDto onionDto, Model model) {
        System.out.println("Running getOnion method...");
        System.out.println("Type: " + onionDto.getType());
        System.out.println("Origin: " + onionDto.getOrigin());
        System.out.println("Company: " + onionDto.getCompany());
        System.out.println("Price: " + onionDto.getPrice());
        System.out.println("Quantity: " + onionDto.getQuantity());

        model.addAttribute("type", onionDto.getType());
        model.addAttribute("origin", onionDto.getOrigin());
        model.addAttribute("company", onionDto.getCompany());
        model.addAttribute("price", onionDto.getPrice());
        model.addAttribute("quantity", onionDto.getQuantity());

        return "OnionResult";
    }
}
