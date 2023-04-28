package com.example.prac13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Prac13Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Prac13Application.class, args);

		Environment env = context.getBean(Environment.class);
		System.out.println(env.getProperty("student.name"));
		System.out.println(env.getProperty("student.last_name"));
		System.out.println(env.getProperty("student.group"));
	}

}
