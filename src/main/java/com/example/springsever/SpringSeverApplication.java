package com.example.springsever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringSeverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSeverApplication.class, args);
    }

}
