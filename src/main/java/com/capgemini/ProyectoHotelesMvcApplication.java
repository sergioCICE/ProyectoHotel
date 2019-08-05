package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ProyectoHotelesMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoHotelesMvcApplication.class, args);
	}

}
