package com.xworkz.trainer.controller;

import com.xworkz.trainer.dto.StudentDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class StudentController {

    public StudentController() {
        System.out.println("const studentcontroller....");
    }

    @RequestMapping("student")
    public ModelAndView getStudent(@Valid StudentDto studentDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("error", bindingResult.getAllErrors());
        }
        modelAndView.setViewName("Student");
        return modelAndView;
    }
}
