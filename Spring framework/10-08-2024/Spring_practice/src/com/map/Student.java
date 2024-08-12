package com.map;

import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Student {
	private String name;
	private Map<String, String> studentMarks;
	
	public Student() {
	}
	
	public Student(String name, Map<String, String> studentMarks) {
		super();
		this.name = name;
		this.studentMarks = studentMarks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(Map<String, String> studentMarks) {
		this.studentMarks = studentMarks;
	}
	
	public void display() {
		System.out.println(name);
		    
	}
	
	
}
