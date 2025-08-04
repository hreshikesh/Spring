package com.xworkz.hitler.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SockComponent {
    public SockComponent(){
        System.out.println("const of SockComponent");
    }
    @RequestMapping("/socks")
    public String getSocks(){
        System.out.println("getSock method..");
        return "socks.jsp";
    }
}
