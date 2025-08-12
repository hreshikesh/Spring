package com.xworkz.hitler.configuaration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.xworkz.hitler")
@EnableWebMvc
public class HitlerConfiguaration implements WebMvcConfigurer {
    public HitlerConfiguaration() {
        System.out.println("Const of HitlerConfiguaration");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    //
//    @Bean
//    public InternalResourceViewResolver resolver(InternalResourceViewResolver resolver){
//     resolver.setSuffix(".jsp");
//
//     return  resolver;
//    }
    @Bean
    public InternalResourceViewResolver setSuffix() {
        return new InternalResourceViewResolver("/", ".jsp");
    }


}
