package com.xworkz.hitler.component;

import com.xworkz.hitler.dto.SockDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
@RequestMapping("/")
public class SockComponent {
    public SockComponent(){
        System.out.println("const of SockComponent");
    }
    @RequestMapping("/socks")
    public String getSocks(SockDto sockDto){
        System.out.println("getSock method..");
        System.out.println("SockName "+sockDto.getSockName()+" sockBrand "+sockDto.getSockBrand()+" sockShop "+sockDto.getSockShop()+" sockPrice"+sockDto.getSockPrice()+" sockMaterial "+sockDto.getSockMaterial());
        return "socks.jsp";
    }
}
