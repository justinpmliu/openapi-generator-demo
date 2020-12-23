package com.example.openapigeneratordemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import com.fasterxml.jackson.databind.Module;
import org.openapitools.jackson.nullable.JsonNullableModule;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.openapigeneratordemo.controller" , "com.example.openapigeneratordemo.configuration"})

public class OpenapiGeneratorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenapiGeneratorDemoApplication.class, args);
	}

	@Bean
	public Module jsonNullableModule() {
		return new JsonNullableModule();
	}

}
