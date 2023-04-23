package com.career.goals.spring.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsPracticeApplication {
	Logger logger =LoggerFactory.getLogger(SpringJenkinsPracticeApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application started..");
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsPracticeApplication.class, args);
	}

}
