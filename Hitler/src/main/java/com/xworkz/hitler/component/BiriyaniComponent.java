package com.xworkz.hitler.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class BiriyaniComponent {
    public BiriyaniComponent(){
        System.out.println("Running BiriryaniComponent const");
    }

    @RequestMapping("/biriyani")
    public String getBiriyani(@RequestParam String biriyaniName,String hotelName,int price,String biriyaniType,int rating){
        System.out.println("getBiriyani method..");
        System.out.println("BiriyaniName "+biriyaniName+" hotelName "+hotelName+" Price "+price+" Biriyani Type "+biriyaniType+" rating "+rating);
        return "biriyani.jsp";
    }

}
