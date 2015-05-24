package com.apress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;

@SpringBootApplication
public class QuickPollApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickPollApplication.class, args);
    }    
}
