package com.xworkz.trainer.controller;

import com.xworkz.trainer.dto.LaptopDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class LaptopController {

    public LaptopController() {
        System.out.println("const laptopcontroller....");
    }

    @RequestMapping("laptop")
    public ModelAndView getLaptop(@Valid LaptopDto laptopDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("error", bindingResult.getAllErrors());
        }
        modelAndView.setViewName("Laptop");
        return modelAndView;
    }
}
