package com.xworkz.hitler.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class SockComponent {
    public SockComponent(){
        System.out.println("const of SockComponent");
    }
    @RequestMapping("/socks")
    public String getSocks(@RequestParam String sockName,String sockBrand,int sockPrice,String sockShop,String sockMaterial){
        System.out.println("getSock method..");
        System.out.println("SockName "+sockName+" sockBrand "+sockBrand+" sockShop "+sockShop+" sockPrice"+sockPrice+" sockMaterial "+sockMaterial);
        return "socks.jsp";
    }
}
