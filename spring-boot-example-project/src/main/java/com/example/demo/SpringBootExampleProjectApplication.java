package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
@PropertySource("classpath:application.yaml")
public class SpringBootExampleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleProjectApplication.class, args);
	}

}
