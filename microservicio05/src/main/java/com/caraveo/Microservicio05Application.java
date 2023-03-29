package com.caraveo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@ComponentScan(basePackages="com.caraveo.controllers")
@SpringBootApplication
public class Microservicio05Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservicio05Application.class, args);
	}
	
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
}
