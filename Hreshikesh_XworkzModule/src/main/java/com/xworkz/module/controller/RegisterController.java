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



        System.out.println(registerDto);

        RegisterEntity registerEntity=new RegisterEntity();
        registerEntity.setName(registerDto.getName());
        registerEntity.setAge(registerDto.getAge());
        registerEntity.setEmail(registerDto.getEmail());
        registerEntity.setAddress(registerDto.getAddress());
        registerEntity.setGender(registerDto.getGender());
        registerEntity.setPhone(registerDto.getPhone());
        registerEntity.setPassword(registerDto.getPassword());
       boolean status= registerService.save(registerEntity);
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
