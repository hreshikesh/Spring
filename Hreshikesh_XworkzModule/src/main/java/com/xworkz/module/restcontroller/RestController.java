package com.xworkz.module.restcontroller;

import com.xworkz.module.service.RegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class RestController {
    @Autowired
    RegisterService registerService;

    @GetMapping(value = "checkEmail/{userEmail}",produces = MediaType.APPLICATION_JSON_VALUE)
    public String checkEmailCount(@PathVariable String userEmail){
       log.info(userEmail);
       int count= registerService.countByEmail(userEmail);
       log.info(String.valueOf(count));
       if(count==0) return " ";
       else return "Email already exists";
    }

    @GetMapping(value = "checkPassword/{password}",produces = MediaType.APPLICATION_JSON_VALUE)
    public String checkPassword(@PathVariable String password){
            boolean check=registerService.passwordValidate(password);
            if (check){
                return "Password already in use";
            }else {
                return " ";
            }
    }
}
