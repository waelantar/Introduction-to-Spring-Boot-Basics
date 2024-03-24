package com.courses.introductiontospringbootbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// The @SpringBootApplication annotation is a convenience annotation that adds the following annotations:
// 1. @Configuration: Indicates that this class can be used by the Spring IoC container as a source of bean definitions.
// 2. @EnableAutoConfiguration: Enables Spring Boot's auto-configuration mechanism, which automatically configures your Spring application based on its classpath and existing configurations.
// 3. @ComponentScan: Enables component scanning for Spring-managed components like controllers, services, and repositories.
@SpringBootApplication
public class IntroductionToSpringBootBasicsApplication {

    // The main method is the entry point of the Spring Boot application.
    public static void main(String[] args) {
        // SpringApplication.run() starts the Spring application.
        // It takes two arguments: the class with the @SpringBootApplication annotation and the command line arguments.
        SpringApplication.run(IntroductionToSpringBootBasicsApplication.class, args);
    }
}
