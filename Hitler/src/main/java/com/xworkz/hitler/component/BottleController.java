package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.BottleDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BottleController {

    public BottleController() {
        System.out.println("Running BottleComponent const");
    }

    @RequestMapping("/bottle")
    public String getBottle(BottleDto bottleDto) {
        System.out.println("getBottle method..");
        System.out.println("Bottle Name: " + bottleDto.getBottleName() + " Brand Name: " + bottleDto.getBrandName() + " Price: " + bottleDto.getPrice() + " Material: " + bottleDto.getMaterial() + " Capacity: " + bottleDto.getCapacity());
        return "bottle.jsp";
    }

}
