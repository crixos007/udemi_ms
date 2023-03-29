package com.caraveo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.caraveo.controllers","com.caraveo.dao","com.caraveo.service"})
@EntityScan(basePackages = {"com.caraveo.model"})
@EnableJpaRepositories(basePackages = {"com.caraveo.dao"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}