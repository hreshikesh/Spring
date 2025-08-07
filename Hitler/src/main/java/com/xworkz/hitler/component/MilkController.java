package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.MilkDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MilkController {
    public MilkController(){
        System.out.println("const of MilkComponent");
    }
    @RequestMapping("/milk")
    public String getMilk(MilkDto milkDto){
        System.out.println("getMilk method..");
        System.out.println("Milk Type: " + milkDto.getMilkType() + ", Source: " + milkDto.getSource() + ", Company: " + milkDto.getCompany() + ", Price: " + milkDto.getPrice() + ", Quantity: " + milkDto.getQuantity());
        return "milk.jsp";
    }
}
