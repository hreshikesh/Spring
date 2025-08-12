package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.SoapDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SoapController {

    public SoapController() {
        System.out.println("Created SoapComponent");
    }

    @RequestMapping("soap")

    public String handleSoap(SoapDto soapDto, Model model) {
        System.out.println("Running SoapComponent...");
        System.out.println("Soap - Type: " + soapDto.getType() + ", Origin: " + soapDto.getOrigin() +
                ", Company: " + soapDto.getCompany() + ", Price: " + soapDto.getPrice() +
                ", Quantity: " + soapDto.getQuantity());

        model.addAttribute("type", soapDto.getType());
        model.addAttribute("origin", soapDto.getOrigin());
        model.addAttribute("company", soapDto.getCompany());
        model.addAttribute("price", soapDto.getPrice());
        model.addAttribute("quantity", soapDto.getQuantity());

        return "SoapResult";
    }

}
