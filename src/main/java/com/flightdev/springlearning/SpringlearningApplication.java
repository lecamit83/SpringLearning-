package com.flightdev.springlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.flightdev.springlearning")
@SpringBootApplication
public class SpringlearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringlearningApplication.class, args);
    }

}
