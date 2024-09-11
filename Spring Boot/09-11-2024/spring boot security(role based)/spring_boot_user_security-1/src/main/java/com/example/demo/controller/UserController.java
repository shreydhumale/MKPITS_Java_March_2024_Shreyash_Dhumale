package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String start() {
		return "home";
	}
	@GetMapping("/employee")
	public String showEmployee() {
		return "employee";
	}
	
	@GetMapping("/manager")
	public String showManager(){
		return "manager";
	}
	
	@GetMapping("/admin")
	public String loginUser() {
		return "admin";
	}
	
}
