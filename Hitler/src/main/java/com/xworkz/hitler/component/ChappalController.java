package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.ChappalDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class ChappalController {

    public ChappalController() {
        System.out.println("Running ChappalComponent const");
    }

    @RequestMapping("/chappal")
    public String getChappal(ChappalDto chappalDto) {
        System.out.println("getChappal method..");
        System.out.println("Chappal Name: " + chappalDto.getChappalName() + " Brand Name: " + chappalDto.getBrandName() + " Price: " + chappalDto.getPrice() + " Type: " + chappalDto.getChappalType() + " Size: " + chappalDto.getSize());
        return "chappal.jsp";
    }
}
