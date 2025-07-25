package com.xworkz.google.Configuarartion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Timer;

@Configuration
@ComponentScan(basePackages = ("com.xworkz.google.PizzaHut"))
public class PizzaHutConfiguaration {

    @Bean
    public int noOfPizza(){
        System.out.println("Running PizzaHut Beans");
        System.out.println("no of Pizza Bean");
        return 1;
    }
    @Bean
    public float priceOfPizza(){
        System.out.println("price of Pizza Bean");
        return 1.23f;
    }

    @Bean
    public double sliceOfPizza(){
        System.out.println("no of slice Pizza Bean");
        return 2.5468;
    }

    @Bean
    public char gradeOfPizza(){
        System.out.println("grade of Pizza Bean");
        return 'a';
    }

    @Bean
    public short noOfPizzaTopping(){
        System.out.println("no of Pizza Bean");
        return 12;
    }

    @Bean
    public long phoneNumber(){
        System.out.println("phonenumber of pizza");
        return 8945671258L;
    }

    @Bean
    public boolean isTasty(){
        System.out.println("is pizza tasty");
        return true;
    }

    @Bean
    public byte pizzaSpices(){
        System.out.println("is pizza spices");
        return 3;
    }

    @Bean
    public String pizzaName(){
        System.out.println("Pizza Name");
        return "RedHot Pizza";
    }

    @Bean
    public String[] pizzaBranch(){
        System.out.println("Pizza Location");
        System.out.println("-------------------------");
        return new String[]{"Bangalore","Mangalore","Udupi","Kasargod"};

    }

    @Bean
    public PrintWriter jobPrintWriter() throws Exception {
        System.out.println("PrintWriter Bean Created");
        return new PrintWriter("print.txt");
    }
    @Bean
    public BigDecimal jobBigDecimal() {
        System.out.println("BigDecimal Bean Created");
        return new BigDecimal("123456.78");
    }

    @Bean
    public Comparator<String> jobComparator() {
        System.out.println("Comparator Bean Created");
        return Comparator.naturalOrder();
    }


    @Bean
    public Timer jobTimer() {
        System.out.println("Timer Bean Created");
        return new Timer();
    }






}
