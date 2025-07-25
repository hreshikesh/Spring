package com.xworkz.google.Configuarartion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
@ComponentScan(basePackages = ("com.xworkz.google.Mobile"))
public class MobileConfiguaration {
    @Bean
    public ArrayDeque<String> mobileName(){
        System.out.println("--------------");
        System.out.println("mobile beans ");
        System.out.println("mobile name config");
        return new ArrayDeque<>(Arrays.asList("A15","14Plus","15ProMax"));
    }

    @Bean
    public Map<String,Integer> mobileShopName(){
        System.out.println("mobile shop name config");
        return new HashMap<String,Integer>(){
            {
                put("LocoMobile",1);
                put("MobilePoint",2);
            }
        };
    }

    @Bean
    public HashMap<String,Integer> mobilePrice(){
        System.out.println("mobile Price config");
        return new HashMap<String,Integer>(){
            {
                put("Iphoen",140000);
                put("Samsung",20000);
            }
        };
    }

    @Bean
    public LinkedHashMap<String,String> mobileCompany(){
        System.out.println("mobile Company config");
        return new LinkedHashMap<String,String>(){
            {
                put("Iphone14","Apple");
                put("SamsungA15","Samsung");
            }
        };
    }

    @Bean
    public TreeMap<Character,String> mobilerating(){
        System.out.println("mobile Price config");
        return new TreeMap<Character,String>(){
            {
                put('A',"Apple");
                put('C',"Samsung");
            }
        };
    }

    @Bean
    public Vector<String> mobileModel(){
        System.out.println("Mobile Model");
        return new Vector<>(Arrays.asList("Iphone14plus","SamsungS21","PocoX7"));
    }

    @Bean
    public Stack<String> mobileOwner(){
        System.out.println("Mobile Owner");
        Stack<String> stack=new Stack<>();
        stack.addAll(Arrays.asList("Rishi","Vaibhav","Roshan"));
        return stack;
    }


    public enum MobileType {
        ELECTRIC,
        SOLAR,
        HYBRID
    }
    @Bean
    public EnumSet<MobileType> mobileType(){
        System.out.println("Mobile Type config");
        return EnumSet.of(MobileType.HYBRID);
    }

    @Bean
    public Queue<String> mobileCompanyOwner(){
        System.out.println("mobileCompanyOwner config");
        return new ArrayDeque<>(Arrays.asList("SteveJobs","TimCook","SunderPichai"));
    }

    @Bean
    public NavigableMap<Integer,String> mobileRating(){
        System.out.println("mobile rating config");
        return new TreeMap<Integer,String>(){{
            put(1,"Iphone");
            put(2,"Samsung");

        }};

    }





}
