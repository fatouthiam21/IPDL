package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;

import org.springframework.web.bind.annotation.GetMapping;



@SpringBootApplication
public class DemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		logger.info("Car App started ! Goto http://localhost:8081/dic_student_name");
	}

}

@RestController
@RequestMapping("/dic_student_name")
class DemoController{
	@Value("${fullname:Bass}")
	private String fullname;



	@GetMapping
	String getFullname() {
	return "Work done by "+this.fullname+" !";

	}
}
