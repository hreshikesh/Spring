package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.ParotaDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/")
public class ParotaController {

    public ParotaController() {
        System.out.println("Created ParotaComponent");
    }

    @RequestMapping("parota")
    public String handleParota(ParotaDto parotaDto, Model model) {
        System.out.println("running parota....");
        System.out.println("Parota - Type: " + parotaDto.getType() + ", Origin: " + parotaDto.getOrigin() +
                ", Company: " + parotaDto.getCompany() + ", Price: " + parotaDto.getPrice() +
                ", Quantity: " + parotaDto.getQuantity());

        model.addAttribute("type", parotaDto.getType());
        model.addAttribute("origin", parotaDto.getOrigin());
        model.addAttribute("company", parotaDto.getCompany());
        model.addAttribute("price", parotaDto.getPrice());
        model.addAttribute("quantity", parotaDto.getQuantity());

        return "ParotaResult";
    }

}
