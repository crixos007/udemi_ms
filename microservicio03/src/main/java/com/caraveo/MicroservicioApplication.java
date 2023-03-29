package com.caraveo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.caraveo.controllers"})
@SpringBootApplication
public class MicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioApplication.class, args);
	}

}
