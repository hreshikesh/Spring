package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.EggDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class EggComponent {

    public EggComponent() {
        System.out.println("Running EggComponent const");
    }

    @RequestMapping("/egg")
    public String getEgg(EggDto eggDto) {
        System.out.println("getEgg method..");
        System.out.println("Egg Type: " + eggDto.getEggType() + " Source: " + eggDto.getSource() + " Price: " + eggDto.getPrice() + " Size: " + eggDto.getSize() + " Protein: " + eggDto.getProteinContent() + "g");
        return "egg.jsp";
    }
}
