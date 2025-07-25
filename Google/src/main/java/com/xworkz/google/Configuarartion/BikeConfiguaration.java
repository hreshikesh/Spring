package com.xworkz.google.Configuarartion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.FileWriter;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.time.Year;

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

    @Bean
    public Thread jobThread() {
        System.out.println("Thread Bean Created");
        return new Thread();
    }

    @Bean
    public Path jobPath() {
        System.out.println("Path Bean Created");
        return Paths.get("C:/data");
    }

    @Bean
    public Duration jobDuration() {
        System.out.println("Duration Bean Created");
        return Duration.ofHours(5);
    }

    @Bean
    public FileWriter jobFileWriter() throws Exception {
        System.out.println("FileWriter Bean Created");
        return new FileWriter("output.txt", true);
    }


    @Bean
    public Instant jobInstant() {
        System.out.println("Instant Bean Created");
        return Instant.now();
    }

    @Bean
    public Timestamp jobTimestamp() {
        System.out.println("Timestamp Bean Created");
        return new Timestamp(System.currentTimeMillis());
    }

    @Bean
    public Year jobYear() {
        System.out.println("Year Bean Created");
        return Year.now();
    }

    @Bean
    public URI jobURI() throws Exception {
        System.out.println("URI Bean Created");
        return new URI("https://xworkz.in/careers");
    }

    @Bean
    public Charset jobCharset() {
        System.out.println("Charset Bean Created");
        return Charset.defaultCharset();
    }







}
