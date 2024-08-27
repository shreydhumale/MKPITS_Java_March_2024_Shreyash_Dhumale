package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@SpringBootApplication
public class SpringBootHibernatePracticeApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(SpringBootHibernatePracticeApplication.class, args);
	}
}
