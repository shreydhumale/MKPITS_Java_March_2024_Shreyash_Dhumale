package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String name;
	@Autowired
	private Address address;
	public Student() {
	}
	
	public Student(String name, Address address) {
		this.name=name;
		this.address=address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
