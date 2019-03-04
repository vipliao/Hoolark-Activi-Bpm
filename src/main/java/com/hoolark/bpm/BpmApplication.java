package com.hoolark.bpm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan({"com.hoolark","org.activiti"})
public class BpmApplication {

	public static void main(String[] args) {
		SpringApplication.run(BpmApplication.class, args);
	}

}

