package com.veras.first_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
//@AutoConfiguration
//@ComponentScan
public class FirstSpringAppApplication {

	public static void main(String[] args) {SpringApplication.run(FirstSpringAppApplication.class, args);}

}
