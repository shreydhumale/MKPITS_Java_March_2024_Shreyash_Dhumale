package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class Student {
	
	@Value("${nm}")
	private String name;

	
	@Value("${ct}")
	private String city;

	public Student() {
		
	}
	
	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}

}
