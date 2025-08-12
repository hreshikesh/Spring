package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.ButterDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ButterController {

    public ButterController() {
        System.out.println("Running ButterComponent const");
    }

    @RequestMapping("/butter")
    public String getButter(ButterDto butterDto, Model model) {
        System.out.println("getButter method..");
        System.out.println("Butter Name: " + butterDto.getButterName() + " Brand Name: " + butterDto.getBrandName() +
                " Price: " + butterDto.getPrice() + " Type: " + butterDto.getButterType() +
                " Fat%: " + butterDto.getFatPercentage());
        model.addAttribute("name",butterDto.getBrandName());
        model.addAttribute("brand",butterDto.getButterType());
        model.addAttribute("price",butterDto.getPrice());
        model.addAttribute("type",butterDto.getButterType());
        model.addAttribute("fat",butterDto.getFatPercentage());

        return "ButterResult";
    }
}
