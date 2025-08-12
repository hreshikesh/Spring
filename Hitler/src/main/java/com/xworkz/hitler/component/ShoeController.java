package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.ShoeDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class ShoeController {

    public ShoeController() {
        System.out.println("Created ShoeComponent");
    }

    @RequestMapping("shoe")
    public String handleShoe(ShoeDto shoeDto) {

        System.out.println("Running handleShoe...");
        System.out.println("Shoe - Type: " + shoeDto.getType() + ", Origin: " + shoeDto.getOrigin() + ", Company: " + shoeDto.getCompany() + ", Price: " + shoeDto.getPrice() + ", Quantity: " + shoeDto.getQuantity());

        return "shoe";
    }
}
