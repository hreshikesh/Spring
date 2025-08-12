package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.SockDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Component
@RequestMapping("/")
public class SockComponent {
    public SockComponent(){
        System.out.println("const of SockComponent");
    }
    @RequestMapping("/socks")
    public ModelAndView getSocks(SockDto sockDto,ModelAndView modelAndView){
        System.out.println("getSock method..");
        System.out.println("SockName "+sockDto.getSockName()+" sockBrand "+sockDto.getSockBrand()+" sockShop "
                +sockDto.getSockShop()+" sockPrice"+sockDto.getSockPrice()+" sockMaterial "+sockDto.getSockMaterial());

        modelAndView.addObject("name",sockDto.getSockName());
        modelAndView.addObject("brand",sockDto.getSockBrand());
        modelAndView.addObject("shop", sockDto.getSockShop());
        modelAndView.addObject("price",sockDto.getSockPrice());
        modelAndView.addObject("material",sockDto.getSockMaterial());
        modelAndView.setViewName("SockResult");
        return modelAndView;
    }
}
