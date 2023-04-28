package com.example.prac10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Prac10Application {

	public static void main(String[] args) {
		SpringApplication.run(Prac10Application.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Programmer programmer = context.getBean(args[0], Programmer.class);
		programmer.doCoding();

	}

}
