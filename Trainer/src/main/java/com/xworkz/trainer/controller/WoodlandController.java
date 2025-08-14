package com.xworkz.trainer.controller;

import com.xworkz.trainer.dto.WoodlandDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class WoodlandController {

    public WoodlandController() {
        System.out.println("const woodlandcontroller....");
    }

    @RequestMapping("woodland")
    public ModelAndView getWoodland(@Valid WoodlandDto woodlandDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("error", bindingResult.getAllErrors());
        }
        modelAndView.setViewName("Woodland");
        return modelAndView;
    }
}
