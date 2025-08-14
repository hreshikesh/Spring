package com.xworkz.trainer.controller;

import com.xworkz.trainer.dto.HotelDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class HotelController {
    public HotelController() {
        System.out.println("const hotelcontroller....");
    }

    @RequestMapping("hotel")
    public ModelAndView getHotel(@Valid HotelDto hotelDto, ModelAndView modelAndView, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<ObjectError> errors = bindingResult.getAllErrors();
            modelAndView.addObject("error", errors);
        }

        modelAndView.setViewName("Hotel");
        return modelAndView;
    }
}
