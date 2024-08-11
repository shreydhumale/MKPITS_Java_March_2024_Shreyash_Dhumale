package com.setter_injection;

public class Student {
	private String name;
	private String city;
	private int marks;
	
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(city);
		System.out.println(marks);
	}
}
