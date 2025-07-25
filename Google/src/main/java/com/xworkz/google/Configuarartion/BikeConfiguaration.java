package com.xworkz.google.Configuarartion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = ("com.xworkz.google.Bike"))
public class BikeConfiguaration {
    @Bean
    public int[] bikePrice(){
        System.out.println("Bike Beans");
        System.out.println("bikeprice config");
        return new int[]{1234,5678,91234};
    }

    @Bean
    public short[] bikeQauntity(){
        System.out.println("bikequantity config");
        return new short[]{12,56,23};
    }

    @Bean
    public byte[] bikeDefectiveNo(){
        System.out.println("bikedefective config");
        return new byte[]{1,5,2};
    }

    @Bean
    public char[] bikeQaulity(){
        System.out.println("bikequality config");
        return new char[]{'a','b','c'};
    }

    @Bean
    public float[] bikeCost(){
        System.out.println("bike Cost Config");
        return new float[]{1.2f,4.5f,8f};
    }

    @Bean
    public double[] bikeSpeed(){
        System.out.println("bike Speed Config");
        return new double[]{149.9,45.9,80.1};
    }

    @Bean
    public long[] bikeNo(){
        System.out.println("bike No Config");
        return new long[]{10254l,10255l,215445l};
    }

    @Bean
    public byte[] bikeCapacity(){
        System.out.println("bikeCapacity Config");
        return new byte[]{10,10,21};
    }

    @Bean
    public StringBuffer bikeGreeting(){
        System.out.println("bikeGreeting Config");
        return new StringBuffer("Hello");

    }
    @Bean
    public StringBuilder bikeWelcome() {
        System.out.println("bikeWelcome Config");
        System.out.println("--------------------");
        return new StringBuilder("Welcome");
    }







}
