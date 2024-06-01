package com.demo;

import java.util.List;

import com.dao.StudentDao;
import com.model.Student;
import com.dao.StudentDao2;
import com.dao.StudentDao3;

public class App 
{
    public static void main( String[] args )
    {
    	StudentDao3 sd=new StudentDao3();
    	Student s=new Student();
    	//Insert student
//    	Student s=new Student();
//    	s.setSname("Soumya");
//    	s.setScity("Amravati");
//    	s.setSpercentage(85.4);
//    	System.out.println(sd.insertStudent(s));
    	
    	//delete student
//    	System.out.println(sd.deleteStudentBySid(1));
    	
    	//find student
//    	Student s=sd.findStudentBySid(2);
//    	System.out.println(s);
    	
    	//findAll students
//    	List<Student>list=sd.findAllStudent();
//    	for(Student s:list) {
//    		System.out.println(s);
    	
    	//update student
//    	Student student=sd.findStudentBySid(5);
//    	student.setScity("Mumbai");
//    	student.setSname("Rohit");
//    	System.out.println(sd.updateStudent(student));
   //-----------------------------------------------------------// 	
    	
//    	Student s=new Student();
//    	s.setSname("Kharanshu");
//    	s.setScity("Nagpur");
//    	s.setSpercentage(89.5);
//    	System.out.println(sd.insertStudent(s));
    	
//    	System.out.println(sd.deleteStudentBySid(5));
    	
//    	Student s=sd.findStudentBySid(2);
//    	System.out.println(s);
    	
//    	List<Student>list=sd.findAllStudent();
//    	for(Student s:list) {
//    		System.out.println(s);
    	
//    	Student student=sd.findStudentBySid(6);
//    	student.setScity("Chennai");
//    	student.setSname("Rahul");
//    	System.out.println(sd.updateStudent(student));
    	
//    	Student s=new Student();
//    	s.setSname("Raghav");
//    	s.setScity("Delhi");
//    	s.setSpercentage(75.40);
//    	System.out.println(sd.insertStudent(s));
    	
    
    	//System.out.println(sd.deleteStudentBySid(2));
    	
//    	Student student=sd.findStudentBySid(3);
//    	System.out.println(student);
    	
//    	List<Student>list=sd.findAllStudent();
//    	for(Student student:list) {
//    		System.out.println(student);
    	
//    	Student student=sd.findStudentBySid(6);
//    	student.setScity("Chennai");
//    	student.setSname("Ruturaj");
//    	System.out.println(sd.updateStudent(student));
    	}
    }


