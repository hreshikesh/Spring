package com.xworkz.trainer.controller;

import com.xworkz.trainer.dto.MobileDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class MobileController {

    public MobileController() {
        System.out.println("const mobilecontroller....");
    }

    @RequestMapping("mobile")
    public ModelAndView getMobile(@Valid MobileDto mobileDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("error", bindingResult.getAllErrors());
        }
        modelAndView.setViewName("Mobile");
        return modelAndView;
    }
}
