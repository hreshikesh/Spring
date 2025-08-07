package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.CurryDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class CurryController {

    public CurryController() {
        System.out.println("Running CurryComponent const");
    }

    @RequestMapping("/curry")
    public String getCurry(CurryDto curryDto) {
        System.out.println("getCurry method..");
        System.out.println("Curry Name: " + curryDto.getCurryName() + " Main Ingredient: " + curryDto.getMainIngredient() + " Price: " + curryDto.getPrice() + " Curry Type: " + curryDto.getCurryType() + " Serving Count: " + curryDto.getServingCount());
        return "curry.jsp";
    }
}
