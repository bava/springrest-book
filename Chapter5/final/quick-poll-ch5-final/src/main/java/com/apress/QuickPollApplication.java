package com.apress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class QuickPollApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickPollApplication.class, args);
    }
    
}
