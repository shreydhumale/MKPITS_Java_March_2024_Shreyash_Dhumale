package com.practice;

public class Student {
	private String name;
	private String city;
	private Hobby hobby;
	
	public Student() {
	}

	public Student(String name, String city, Hobby hobby) {
		super();
		this.name = name;
		this.city = city;
		this.hobby = hobby;
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

	public Hobby getHobby() {
		return hobby;
	}

	public void setHobby(Hobby hobby) {
		this.hobby = hobby;
	}

//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", city=" + city + ", hobby=" + hobby + "]";
//	}
//	
	public void display() {
		System.out.println(name);
		System.out.println(city);
		System.out.println(hobby);
	}
}
