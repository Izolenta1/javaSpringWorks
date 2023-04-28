package com.example.prac10;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class BeanConfig {
    @Bean
    Programmer Junior() {
        return new Junior();
    }

    @Bean
    Programmer Middle() {
        return new Middle();
    }

    @Bean
    Programmer Senior() {
        return new Senior();
    }

}