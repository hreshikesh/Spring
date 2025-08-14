package com.xworkz.trainer.controller;

import com.xworkz.trainer.dto.BookDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class BookController {
    public BookController() {
        System.out.println("const bookcontroller....");
    }

    @RequestMapping("book")

    public ModelAndView getBook(@Valid BookDto bookDto , BindingResult bindingResult ,ModelAndView modelAndView) {
        System.out.println(bookDto);

        if (bindingResult.hasErrors()) {

            modelAndView.addObject("errors", bindingResult.getAllErrors());
        }

        modelAndView.setViewName("Book");
        return modelAndView;
    }

}
