package com.example.prac14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(
		exclude = { DataSourceAutoConfiguration.class }
)
public class Prac14Application {

	public static void main(String[] args) {
		SpringApplication.run(Prac14Application.class, args);
	}

}
