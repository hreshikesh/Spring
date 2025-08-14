package com.xworkz.trainer.controller;

import com.xworkz.trainer.dto.DriverDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class DriverController {
    public DriverController(){
        System.out.println("const drivercontroller....");
    }

    @RequestMapping("driver")
    public ModelAndView getDriver(@Valid DriverDto driverDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            List<ObjectError> errors = bindingResult.getAllErrors();
            modelAndView.addObject("errors", errors);
        }
        modelAndView.setViewName("Driver");
        return modelAndView;
    }

}
