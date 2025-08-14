package com.xworkz.trainer.controller;

import com.xworkz.trainer.dto.MovieDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class MovieController {

    public MovieController() {
        System.out.println("const moviecontroller....");
    }

    @RequestMapping("movie")
    public ModelAndView getMovie(@Valid MovieDto movieDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("error", bindingResult.getAllErrors());
        }
        modelAndView.setViewName("Movie");
        return modelAndView;
    }
}
