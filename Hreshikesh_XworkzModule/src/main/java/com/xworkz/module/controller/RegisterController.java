package com.xworkz.module.controller;

import com.xworkz.module.dto.UpdateDto;
import com.xworkz.module.dto.PasswordDto;
import com.xworkz.module.dto.RegisterDto;
import com.xworkz.module.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;
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
            modelAndView.addObject("dto",registerDto);
        } else {
            boolean status = registerService.save(registerDto);
            modelAndView.addObject("status", status);

        }
        return modelAndView;
    }


    @RequestMapping("signin")
    public ModelAndView signUp(String name, String password, ModelAndView modelAndView, HttpSession session) {
        RegisterDto dto1 = registerService.find(name, password);
        if (dto1 == null) {
            modelAndView.addObject("result", "false");
            modelAndView.setViewName("signin");
        } else if(dto1.getName().equals("Locked")){
            modelAndView.addObject("result", "fail");
            modelAndView.setViewName("signin");
        } else if (dto1.getName().equals("TimeOut")) {
            modelAndView.addObject("result", "reset");
            modelAndView.setViewName("signin");
        } else if (dto1.getName().equals("notfound")) {
            modelAndView.addObject("result", "notfound");
            modelAndView.setViewName("signin");
        } else{
            session.setAttribute("loginName",dto1.getName());
            session.setAttribute("loginEmail",dto1.getEmail());
            modelAndView.setViewName("Home");
        }
        return modelAndView;

    }

    @RequestMapping("update")
    public ModelAndView showUpdate(ModelAndView view,HttpSession session) {
        String sessionEmail=(String)session.getAttribute("loginEmail");
        RegisterDto registerDto = registerService.findByEmail(sessionEmail);
        System.out.println(registerDto);
        if (registerDto != null) {
            view.addObject("dto", registerDto);
        }
        view.setViewName("UpdateForm");
        return view;

    }

    @RequestMapping("verify")
    public ModelAndView verifyEmail(String email, ModelAndView modelAndView) {
        RegisterDto registerDto = registerService.findByEmail(email);
        if (registerDto != null) {
            modelAndView.setViewName("ForgotPassword");
            modelAndView.addObject("email",email);
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
            RegisterDto registerDto=registerService.findByEmail(passwordDto.getEmail());
            boolean updateStatus = registerService.updatePassword(passwordDto.getPassword());
            view.addObject("status", updateStatus);
            view.setViewName("ForgotPassword");


        }
        return view;
    }


    @RequestMapping("/updateprofile")
    public ModelAndView updateProfile(@Valid UpdateDto dto, BindingResult result, ModelAndView view, HttpSession session) {
        if (result.hasErrors()) {
            view.addObject("errors", result.getAllErrors());
            view.setViewName("UpdateForm");
        } else {
            boolean status = registerService.updateProfile(dto);
            if (!status) {
                view.addObject("status", "error");
                view.addObject("dto", dto);
                view.setViewName("UpdateForm");
            } else {
                view.addObject("status", "done");
                RegisterDto dto1=registerService.findByEmail(dto.getEmail());
                view.addObject("dto", dto1);
                session.setAttribute("loginName",dto1.getName());
                view.setViewName("UpdateForm");
            }
        }
        return view;
    }

    @RequestMapping("home")
    public ModelAndView getHomePage( ModelAndView modelAndView) {
        modelAndView.setViewName("Home");
        return modelAndView;
    }
}





