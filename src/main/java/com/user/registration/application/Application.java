package com.user.registration.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.user"})
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run( Application.class, args );
    }
}
