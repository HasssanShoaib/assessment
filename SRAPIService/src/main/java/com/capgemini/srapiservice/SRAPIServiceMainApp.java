package com.capgemini.srapiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main application
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.capgemini.srapiservice" })
public class SRAPIServiceMainApp 
{
    public static void main( String[] args )
    {
        System.out.println("SRAPIService Initialization started....");
        SpringApplication.run(SRAPIServiceMainApp.class, args);
        System.out.println("SRAPIService Initialization completed....");
    }
}
