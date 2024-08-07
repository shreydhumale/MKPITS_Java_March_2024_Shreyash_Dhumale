
package com.demo;
import com.demo.Address;

public class Student {
    private String name;
	private int marks;
    private Address address;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student(String name, int marks, Address address) {
  		super();
  		this.name = name;
  		this.marks = marks;
  		this.address = address;
  	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}
    
  
}
