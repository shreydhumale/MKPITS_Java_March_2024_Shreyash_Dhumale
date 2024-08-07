package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Student s1() {
		Student student= new Student();
		student.setName("Anshul");
		student.setCity("Amravati");
		return student;
	}
}
