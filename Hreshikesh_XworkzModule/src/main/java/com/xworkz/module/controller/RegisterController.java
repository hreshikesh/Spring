package com.xworkz.module.controller;

import com.xworkz.module.dto.PasswordDto;
import com.xworkz.module.dto.RegisterDto;
import com.xworkz.module.entity.RegisterEntity;
import com.xworkz.module.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class RegisterController {
    @Autowired
    RegisterService registerService;

    @RequestMapping("/register")
    public ModelAndView registerForm(@Valid RegisterDto registerDto, BindingResult result, ModelAndView modelAndView) {
        modelAndView.setViewName("signup");

        if (result.hasErrors()) {
            modelAndView.addObject("errors", result.getAllErrors());
        } else {
            boolean status = registerService.save(registerDto);
            modelAndView.addObject("status", status);

        }
        return modelAndView;
    }


    @RequestMapping("signin")
    public ModelAndView signUp(String name, String password, RegisterDto dto, ModelAndView modelAndView) {
        RegisterDto dto1 = registerService.find(name, password);
        if (dto1 != null) {
            modelAndView.addObject("name", dto1.getName());
            modelAndView.addObject("email", dto1.getEmail());
            modelAndView.setViewName("Home");
        } else {
            modelAndView.addObject("result", "false");
            modelAndView.setViewName("signin");
        }
        return modelAndView;

    }

    @RequestMapping("update")
    public ModelAndView showUpdate(@RequestParam String email, ModelAndView view) {
        RegisterDto registerDto = registerService.findByEmail(email);
        System.out.println(registerDto);
        if (registerDto != null) {
            view.addObject("dto", registerDto);
        }
        view.setViewName("Update");
        return view;

    }

    @RequestMapping("verify")
    public ModelAndView verifyEmail(String email, ModelAndView modelAndView) {
        RegisterDto registerDto = registerService.findByEmail(email);
        if (registerDto != null) {
            modelAndView.setViewName("ForgotPassword");
        } else {
            modelAndView.addObject("status", "fail");
            modelAndView.setViewName("VerifyEmail");
        }
        return modelAndView;
    }


    @RequestMapping("updatePassword")
    public ModelAndView updatePassword(@Valid PasswordDto passwordDto, BindingResult result, ModelAndView view) {
        if (result.hasErrors()) {
            view.addObject("errors", result.getAllErrors());
            view.setViewName("ForgotPassword");
        } else {
            boolean updateStatus = registerService.updatePassword(passwordDto.getPassword());
            view.addObject("status", updateStatus);
            view.setViewName("ForgotPassword");
        }
        return view;
    }


    @RequestMapping("updateProfile")
    public ModelAndView updateProfile(@Valid RegisterDto dto, BindingResult result, ModelAndView view) {

        if (result.hasErrors()) {
            view.addObject("errors", result.getAllErrors());
            view.setViewName("Update");
        } else {
            RegisterDto dto1 = registerService.updateProfile(dto);
            view.setViewName("Update");
            if (dto1 == null) {
                view.addObject("status", "error");
                view.addObject("dto", dto1);

            } else {

                view.addObject("status", "done");
                view.addObject("dto", dto1);
                view.addObject("name", dto.getName());
            }
        }
        return view;

    }

    @RequestMapping("home")
    public ModelAndView getHomePage(String name, String email, ModelAndView modelAndView) {
        modelAndView.addObject("name",name);
        modelAndView.addObject("email",email);
        modelAndView.setViewName("Home");
        return modelAndView;
    }


}





