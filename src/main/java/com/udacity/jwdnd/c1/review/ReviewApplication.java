package com.udacity.jwdnd.c1.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}
	@Bean
	public String message() {
		System.out.println("Instantiated first bean");
		return "Hello, Spring!";
	}

	@Bean
	public String uppercaseMessage(MessageService messageService) {
		System.out.println("Instantiated third bean");
		return messageService.uppercaseMessage();
	}

	@Bean
	public String lowercaseMessage(MessageService messageService) {
		return messageService.lowercaseMessage();
	}
}
