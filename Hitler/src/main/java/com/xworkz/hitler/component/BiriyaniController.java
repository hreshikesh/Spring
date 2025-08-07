package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.BiriyaniDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BiriyaniController {
    public BiriyaniController(){
        System.out.println("Running BiriryaniComponent const");
    }

    @RequestMapping("/biriyani")
    public String getBiriyani(BiriyaniDto biriyaniDto){
        System.out.println("getBiriyani method..");
        System.out.println("BiriyaniName "+biriyaniDto.getBiriyaniName()+" hotelName "+biriyaniDto.getHotelName()+" Price "+biriyaniDto.getPrice()+" Biriyani Type "+biriyaniDto.getBiriyaniType()+" rating "+biriyaniDto.getRating());
        return "biriyani.jsp";
    }

}
