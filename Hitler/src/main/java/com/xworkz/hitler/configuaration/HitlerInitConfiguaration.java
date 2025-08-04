package com.xworkz.hitler.configuaration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class HitlerInitConfiguaration extends AbstractAnnotationConfigDispatcherServletInitializer {


    public HitlerInitConfiguaration(){
        System.out.println("Const of HitlerInitConfiguaration");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{HitlerConfiguaration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/link","/soap","/butter","/bottle","/shoe","/chappal","/socks","/chutney","/onion","/milk","/curry","/biriyani","/parota","/egg"};
    }
}
