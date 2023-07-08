package com.illuminateskills.jenkins.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringApplication.class);
	
	
	public void init() {
		
		logger.info("Application Started");
	}

	public static void main(String[] args) {
		
		logger.info("application executed...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
