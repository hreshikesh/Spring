package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.ParotaDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/")
public class ParotaController {

    public ParotaController() {
        System.out.println("Created ParotaComponent");
    }

    @PostMapping("parota")
    public String handleParota(ParotaDto parotaDto) {


        System.out.println("running parota....");
        System.out.println("Parota - Type: " + parotaDto.getType() + ", Origin: " + parotaDto.getOrigin() + ", Company: " + parotaDto.getCompany() + ", Price: " + parotaDto.getPrice() + ", Quantity: " + parotaDto.getQuantity());

        return "parota.jsp";
    }
}
