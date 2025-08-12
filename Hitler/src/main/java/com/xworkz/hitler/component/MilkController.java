package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.MilkDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MilkController {
    public MilkController(){
        System.out.println("const of MilkComponent");
    }
    @RequestMapping("/milk")
    public ModelAndView getMilk(MilkDto milkDto, ModelAndView modelAndView) {
        System.out.println("getMilk method..");
        System.out.println("Milk Type: " + milkDto.getMilkType() + ", Source: " + milkDto.getSource() +
                ", Company: " + milkDto.getCompany() + ", Price: " + milkDto.getPrice() +
                ", Quantity: " + milkDto.getQuantity());

        modelAndView.addObject("type", milkDto.getMilkType());
        modelAndView.addObject("source", milkDto.getSource());
        modelAndView.addObject("company", milkDto.getCompany());
        modelAndView.addObject("price", milkDto.getPrice());
        modelAndView.addObject("quantity", milkDto.getQuantity());

        modelAndView.setViewName("MilkResult");

        return modelAndView;
    }
}
