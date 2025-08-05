package com.xworkz.avenger.configuaration;

import com.xworkz.avenger.component.ThorComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.avenger")
public class AvengerConfiguaration {
    public AvengerConfiguaration(){
        System.out.println("AvengerConfiguaration Const....");

    }

    @Bean
    public String getThorLocation(){
        System.out.println("Running getThorLocation");
        return "bangalore";
    }

    @Bean
    public int getAvengerNo(){
        System.out.println("Running getAvengerNo");
        return 6;
    }
}
