package com.tourisum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TourisumModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourisumModuleApplication.class, args);
		System.out.println("localhost 9090");
	}

}
