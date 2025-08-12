package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.BiriyaniDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class BiriyaniController {
    public BiriyaniController(){
        System.out.println("Running BiriryaniComponent const");
    }

    @RequestMapping("/biriyani")
    public String getBiriyani(BiriyaniDto biriyaniDto, Model model){
        System.out.println("getBiriyani method..");
        System.out.println("BiriyaniName "+biriyaniDto.getBiriyaniName()+" hotelName "+biriyaniDto.getHotelName()+" Price "
                +biriyaniDto.getPrice()+" Biriyani Type "+biriyaniDto.getBiriyaniType()+" rating "+biriyaniDto.getRating());

//        model.addObject("name",biriyaniDto.getBiriyaniName());
//        model.addObject("hotelName",biriyaniDto.getHotelName());
//        model.addObject("price",biriyaniDto.getPrice());
//        model.addObject("type",biriyaniDto.getBiriyaniType());
//        model.addObject("rating",biriyaniDto.getRating());

        model.addAttribute("dto",biriyaniDto);


        return "BiriryaniResult";
    }

}
