package com.xworkz.trainer.controller;

import com.xworkz.trainer.dto.PgDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class PgController {

    public PgController() {
        System.out.println("const pgcontroller....");
    }

    @RequestMapping("pg")
    public ModelAndView getPg(@Valid PgDto pgDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("error", bindingResult.getAllErrors());
        }
        modelAndView.setViewName("Pg");
        return modelAndView;
    }
}
