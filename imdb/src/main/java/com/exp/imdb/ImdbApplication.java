package com.exp.imdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.exp.imdb"})
public class ImdbApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(ImdbApplication.class, args);
	}
}
