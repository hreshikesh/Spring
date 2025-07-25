package com.xworkz.google.Configuarartion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


@Configuration
@ComponentScan(basePackages = ("com.xworkz.google.Bus"))
public class BusConfiguarartion {
    @Bean
    public File busFile() {
        System.out.println("------------");
        System.out.println("Bus beans");
        System.out.println("BusFile Conf");
        return new File("bus.txt");
    }
    @Bean
    public Optional<String> optionalCompanyName() {
        System.out.println("optional config");
        return Optional.of("Xworkz ");
    }

    @Bean
    public Random companyRandom() {
        System.out.println(" Random config");
        return new Random();
    }

    @Bean
    public Currency companyCurrency() {
        System.out.println("Currency Config");
        return Currency.getInstance("Dollar");
    }

    @Bean
    public Locale companyLocale() {
        System.out.println("Locale Config");
        return Locale.ENGLISH;
    }

    @Bean
    public NumberFormat companyNumberFormat() {
        System.out.println(" NumberFormat Config");
        return NumberFormat.getInstance();
    }

    @Bean
    public AtomicInteger companyAtomicInteger() {
        System.out.println(" AtomicInteger Config");
        return new AtomicInteger(100);
    }



    @Bean
    public URL busUrl() {
        System.out.println("bus urlConf");
        try {
            return new URL("https://transport.gov.in/track");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Bean
    public Date busDate() {
        System.out.println("busdate Config");
        return Date.from(Instant.now());
    }

    @Bean
    public LocalDate busLocalDate() {
        System.out.println("bus local date config");
        return LocalDate.of(2025, 5, 14);
    }

    @Bean
    public LocalDateTime busLocalDateTime(){
        System.out.println("LocalDateTime config");
        return LocalDateTime.now();
    }

    @Bean
    public LocalTime busLocalTime(){
        System.out.println("Local Time Config");
        return LocalTime.now();
    }

    @Bean
    public DateTimeFormatter busDateTimeFormatter(){
        System.out.println("DateTimeFormatter config");
        return DateTimeFormatter.ISO_DATE_TIME;
    }

    @Bean
    public DateFormat busDateFormat(){
        System.out.println("DateFormatDateFormat config");
        return DateFormat.getDateInstance();
    }

    @Bean
    public SimpleDateFormat busSimpleDateFormat(){
        System.out.println("SimpleDateFormat config");
        return  new SimpleDateFormat("dd-mm-yyyy");
    }

    @Bean
    public ZonedDateTime busZonedDateTime() {
        System.out.println("busZonedDateTime Config");
        return ZonedDateTime.now(ZoneId.of("Kolkata"));
    }

}
