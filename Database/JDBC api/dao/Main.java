package com.dao;
import com.model.*;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	Practice p=new Practice();
	List<Student>list=p.findStudentByAny("abc");
	for(Student s: list) {
		System.out.println(s);
	}
	}
}
