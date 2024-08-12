package com.collection;

import java.util.Iterator;
import java.util.List;

public class Student {
	private String name;
	private List<String> sports;
	
	public Student() {
	}
	
	
	public Student(String name, List<String> sports) {
		super();
		this.name = name;
		this.sports = sports;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getList() {
		return sports;
	}
	public void setList(List<String> list) {
		this.sports = list;
	}
	
	public void display() {
		System.out.println(name);
		Iterator<String> iterator=sports.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
