package com.ddlab.rnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ExceptionHandlingFeignApp {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionHandlingFeignApp.class,args);
	}

}
