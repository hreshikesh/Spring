package com.xworkz.module.controller;

import com.xworkz.module.dto.RegisterDto;
import com.xworkz.module.entity.RegisterEntity;
import com.xworkz.module.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.Valid;
import java.util.Properties;


@Controller
@RequestMapping("/")
public class RegisterController {
@Autowired
    RegisterService registerService;
    @RequestMapping("/register")
    public ModelAndView Form(@Valid RegisterDto registerDto, BindingResult result, ModelAndView modelAndView){
        System.out.println(registerDto);

       boolean status= registerService.save(registerDto);
        if(result.hasErrors()){
            modelAndView.addObject("errors",result.getAllErrors());
        }
        modelAndView.addObject("status",status);
        modelAndView.setViewName("signup");
        return modelAndView;
    }


    @RequestMapping("signin")
    public ModelAndView signUp(String name,String password,ModelAndView modelAndView){
        boolean result=registerService.find(name,password);

        modelAndView.addObject("result",result);


        modelAndView.setViewName("signin");
        return modelAndView;


    }

}
