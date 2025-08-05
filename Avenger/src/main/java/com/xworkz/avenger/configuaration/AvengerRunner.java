package com.xworkz.avenger.configuaration;

import com.xworkz.avenger.component.IronManComponent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class AvengerRunner {
    public static void main(String[] args) {
        //creating a instance of application context through AnnotationConfigApplicationContext(
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AvengerConfiguaration.class);

        //we get a ref of bean by getBean() with arg passed as the  beanname and classname
        String location=applicationContext.getBean("getThorLocation",String.class);
        System.out.println(location);


        int no=applicationContext.getBean("getAvengerNo",int.class);
        System.out.println(no);


    }
}
