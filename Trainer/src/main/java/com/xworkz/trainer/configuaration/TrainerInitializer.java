package com.xworkz.trainer.configuaration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TrainerInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    public TrainerInitializer(){
        System.out.println("const of init...");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{TrainerConfiguaration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
