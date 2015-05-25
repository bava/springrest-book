package com.apress.hellorest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class HelloWorldRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldRestApplication.class, args);
    }
	
	@RequestMapping("/greet")
    public String helloGreeting() {
        return "Hello REST";
    }

}
