package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.ChappalDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class ChappalController {

    public ChappalController() {
        System.out.println("Running ChappalComponent const");
    }

    @RequestMapping("/chappal")
    public ModelAndView getChappal(ChappalDto chappalDto,ModelAndView modelAndView) {
        System.out.println("getChappal method..");
        System.out.println("Chappal Name: " + chappalDto.getChappalName() + " Brand Name: " +
                chappalDto.getBrandName() + " Price: " + chappalDto.getPrice() + " Type: " +
                chappalDto.getChappalType() + " Size: " + chappalDto.getSize());

        modelAndView.addObject("name",chappalDto.getChappalName());
        modelAndView.addObject("brand",chappalDto.getBrandName());
        modelAndView.addObject("price",chappalDto.getPrice());
        modelAndView.addObject("type",chappalDto.getChappalType());
        modelAndView.addObject("size",chappalDto.getSize());

        modelAndView.setViewName("ChappalResult");
        return modelAndView;
    }
}
