package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.CurryDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class CurryController {

    public CurryController() {
        System.out.println("Running CurryComponent const");
    }

    @RequestMapping("/curry")
    public ModelAndView getCurry(CurryDto curryDto,ModelAndView modelAndView) {
        System.out.println("getCurry method..");
        System.out.println("Curry Name: " + curryDto.getCurryName() + " Main Ingredient: " + curryDto.getMainIngredient() +
                " Price: " + curryDto.getPrice() + " Curry Type: " + curryDto.getCurryType() +
                " Serving Count: " + curryDto.getServingCount());

        modelAndView.addObject("name",curryDto.getCurryName());
        modelAndView.addObject("main", curryDto.getMainIngredient());
        modelAndView.addObject("price",curryDto.getPrice());
        modelAndView.addObject("type",curryDto.getCurryType());
        modelAndView.addObject("count",curryDto.getServingCount());

        modelAndView.setViewName("CurryResult");
        return modelAndView;
    }
}
