package com.xworkz.hitler.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Link1Component {
    public Link1Component(){
        System.out.println("Constructor of Link1Component");
    }

    @RequestMapping("/link")
    public String getLink(){
        System.out.println("Get Link Method");
        return "link1.jsp";
    }
}
