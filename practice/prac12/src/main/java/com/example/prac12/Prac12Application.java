package com.example.prac12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Prac12Application {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(Prac12Application.class, args);

		FileHandler fileHandler = new FileHandler();
	}

}
