package com.xworkz.trainer.controller;

import com.xworkz.trainer.dto.CarDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class CarController {

    public CarController() {
        System.out.println("CarController created...");
    }

    @RequestMapping("car")
    public ModelAndView getCar(@Valid CarDto carDto, BindingResult bindingResult, ModelAndView modelAndView) {
        System.out.println("Received CarDto: " + carDto);

        if (bindingResult.hasErrors()) {
            List<ObjectError> errors = bindingResult.getAllErrors();
            modelAndView.addObject("errors", errors);
        }

        modelAndView.setViewName("Car");
        return modelAndView;
    }
}
