package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.ChutneyDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ChutneyController {

    public ChutneyController() {
        System.out.println("Running ChutneyComponent const");
    }

    @RequestMapping("/chutney")
    public String getChutney(ChutneyDto chutneyDto) {
        System.out.println("getChutney method..");
        System.out.println("Chutney Name: " + chutneyDto.getChutneyName() + " Color: " + chutneyDto.getColor() + " Price: " + chutneyDto.getPrice() + " Taste: " + chutneyDto.getTaste() + " Spice Level: " + chutneyDto.getSpiceLevel());
        return "chutney.jsp";
    }
}
