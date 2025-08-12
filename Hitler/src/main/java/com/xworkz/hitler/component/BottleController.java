package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.BottleDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class BottleController {

    public BottleController() {
        System.out.println("Running BottleComponent const");
    }

    @RequestMapping("/bottle")
    public ModelAndView getBottle(BottleDto bottleDto,ModelAndView modelAndView) {
        System.out.println("getBottle method..");
        System.out.println("Bottle Name: " + bottleDto.getBottleName() + " Brand Name: " + bottleDto.getBrandName() + " Price: " + bottleDto.getPrice() +
                " Material: " + bottleDto.getMaterial() + " Capacity: " + bottleDto.getCapacity());
        modelAndView.addObject("name",bottleDto.getBottleName());
        modelAndView.addObject("brand",bottleDto.getBrandName());
        modelAndView.addObject("price",bottleDto.getPrice());
        modelAndView.addObject("material",bottleDto.getMaterial());
        modelAndView.addObject("capacity",bottleDto.getCapacity());

        modelAndView.setViewName("BottleResult");

        return modelAndView;
    }

}
