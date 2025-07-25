package com.xworkz.google.Configuarartion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
@ComponentScan(basePackages = ("com.xworkz.google.Train"))
public class TrainConfiguaration {

    @Bean
    public Collection<String> goodTrain(){
        System.out.println("Train Beans");
        System.out.println("good train Config");
        List<String> stringList=new ArrayList<>(Arrays.asList("Masyagandha","MIMo","Malabar"));
        return stringList;
    }

    @Bean
    public List<Integer> trainprice(){
        System.out.println("trainprice Config");
        return new ArrayList<>(Arrays.asList(100,200,300));
    }

    @Bean
    public ArrayList<String> trainStation(){
        System.out.println("trainprice Config");
        return new ArrayList<>(Arrays.asList("Mangalore","Bangalore","Kannur"));
    }

    @Bean
    public LinkedList<Boolean> trainFoodTasty(){
        System.out.println("trainfood Config");
        return new LinkedList<>(Arrays.asList(true,false,true));
    }

    @Bean
    public Set<Double> trainSpeed(){
        System.out.println("trainspeed Config");
        return new HashSet<>(Arrays.asList(40.22,45.2,250.2));
    }

    @Bean
    public HashSet<Long> trainDriverNo(){
        System.out.println("trainphno Config");
        return new HashSet<>(Arrays.asList(671322L,458799L,25025L));
    }

    @Bean
    public LinkedHashSet<String> trainDriverName(){
        System.out.println("train driver name Config");
        return new LinkedHashSet<>(Arrays.asList("harish","Ramu","Sartak"));
    }

    @Bean
    public SortedSet<Integer> trainDriverExp(){
        System.out.println("train driver name Config");
        return new TreeSet<>(Arrays.asList(1,5,8));
    }

    @Bean
    public TreeSet<Integer> trainDriverSalary(){
        System.out.println("train driver Salary Config");
        return new TreeSet<>(Arrays.asList(10000,50000,80000));
    }

    @Bean
    public Deque<Integer> trainDriverAge(){
        System.out.println("train driver Salary Config");
        return new ArrayDeque<>(Arrays.asList(55,45,35));
    }




}
