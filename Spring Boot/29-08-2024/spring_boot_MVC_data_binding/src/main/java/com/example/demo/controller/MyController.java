package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Student;

@Controller
public class MyController {

	//data binding
	   @GetMapping("/showform")
	    public String showForm(Model model) {
	    	model.addAttribute("student", new Student());
	    	return "student-form";
	    }
	    
	    @PostMapping("/processStudentForm")
	    public String processForm(@ModelAttribute("student") Student student) {
	    	 System.out.println("theStudent: " + student.getFirstName() 
	    	+ " " + student.getLastName());
	    	 return "student_confirmation";

	    	 }
}
