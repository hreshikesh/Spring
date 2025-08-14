package com.xworkz.trainer.controller;

import com.xworkz.trainer.dto.MusicDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class MusicController {

    public MusicController() {
        System.out.println("const musiccontroller....");
    }

    @RequestMapping("music")
    public ModelAndView getMusic(@Valid MusicDto musicDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("error", bindingResult.getAllErrors());
        }
        modelAndView.setViewName("Music");
        return modelAndView;
    }
}
