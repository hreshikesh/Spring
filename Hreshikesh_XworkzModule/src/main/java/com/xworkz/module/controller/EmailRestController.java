package com.xworkz.module.controller;

import com.xworkz.module.service.RegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("/")
public class EmailRestController {
    @Autowired
    RegisterService registerService;

    @GetMapping("checkEmail/{userEmail}")
    public String checkCount(@PathVariable String userEmail){
       log.info(userEmail);
       int count= registerService.countByEmail(userEmail);
       log.info(String.valueOf(count));
       if(count==0) return "Email Valid";
       else return "Email already exists";
    }


}
