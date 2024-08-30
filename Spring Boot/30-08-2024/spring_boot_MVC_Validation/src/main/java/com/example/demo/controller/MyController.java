package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Student;

import jakarta.validation.Valid;

@Controller
public class MyController {

	// data binding
	@GetMapping("/showform")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}

	@PostMapping("/processStudentForm")
	public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, Model model) {
		System.out.println(student);
		if (bindingResult.hasErrors()) {
	        return "student-form";
	    } else {
	        return "student_confirmation";
	    }
	}

}

//System.out.println("Student Info: " + student.getFirstName() + " " + 
//student.getLastName() + " " +                 
//student.getCity() + " " + 
//student.getFavoriteSubject() + "" + 
//student.getFavouriteLangauge());
//List<String> selectLanguages = student.getFavouriteLangauge();
//model.addAttribute("favouriteLangauge", selectLanguages);
