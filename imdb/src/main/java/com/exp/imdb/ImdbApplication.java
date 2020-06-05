package com.exp.imdb;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import com.exp.imdb.entity.TitleBasics;
import com.exp.imdb.enumeration.TitleTypeEnum;
import com.exp.imdb.repository.TitleBasicsRepository;

@Configuration
@SpringBootApplication(scanBasePackages = {"com.exp.imdb"})
public class ImdbApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(ImdbApplication.class, args);
	}
}
