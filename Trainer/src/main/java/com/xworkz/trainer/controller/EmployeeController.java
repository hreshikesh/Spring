package com.xworkz.trainer.controller;

import com.xworkz.trainer.dto.EmployeeDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class EmployeeController {
    public EmployeeController() {
        System.out.println("const employeecontroller....");
    }

    @RequestMapping("employee")
    public ModelAndView getEmployee(@Valid EmployeeDto employeeDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            List<ObjectError> errors = bindingResult.getAllErrors();
            modelAndView.addObject("errors", errors);
        }
        modelAndView.setViewName("Employee");
        return modelAndView;
    }
}
