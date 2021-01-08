package com.jithendra.awselasticbeanstackexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsElasticbeanstackExampleApplication {
	
	@GetMapping("/status")
	public String deploy()
	{
		return "Application deployed in elastic beanstack";
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsElasticbeanstackExampleApplication.class, args);
	}

}
