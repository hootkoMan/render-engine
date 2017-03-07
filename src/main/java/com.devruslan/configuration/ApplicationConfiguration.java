package com.devruslan.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ruslan on 07.03.17.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ApplicationConfiguration {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ApplicationConfiguration.class, args);
        System.out.println("Start app");
    }
}
