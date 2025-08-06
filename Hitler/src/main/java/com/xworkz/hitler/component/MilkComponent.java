package com.xworkz.hitler.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class MilkComponent {
    public MilkComponent(){
        System.out.println("const of MilkComponent");
    }
    @RequestMapping("/milk")
    public String getMilk(@RequestParam String milkType,String source,String company,int price,int quantity){
        System.out.println("getMilk method..");
        System.out.println("Milk Type: " + milkType + ", Source: " + source + ", Company: " + company + ", Price: " + price + ", Quantity: " + quantity);
        return "milk.jsp";
    }
}
