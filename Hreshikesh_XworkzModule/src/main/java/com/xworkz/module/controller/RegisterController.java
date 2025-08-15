package com.xworkz.module.controller;

import com.sun.org.apache.bcel.internal.generic.MONITORENTER;
import com.xworkz.module.dto.RegisterDto;
import com.xworkz.module.entity.RegisterEntity;
import com.xworkz.module.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class RegisterController {
@Autowired
    RegisterService registerService;
    @RequestMapping("/register")
    public ModelAndView Form(@Valid RegisterDto registerDto, BindingResult result, ModelAndView modelAndView){

        if(result.hasErrors()){
            modelAndView.addObject("errors",result.getAllErrors());
        }

        System.out.println(registerDto);
        RegisterEntity register=new RegisterEntity();
        register.setName(registerDto.getName());
        register.setAge(registerDto.getAge());
        register.setEmail(registerDto.getEmail());
        register.setAddress(registerDto.getAddress());
        register.setGender(registerDto.getGender());
        register.setPhone(registerDto.getPhone());
        register.setPassword(registerDto.getPassword());

       boolean status= registerService.save(register);




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
