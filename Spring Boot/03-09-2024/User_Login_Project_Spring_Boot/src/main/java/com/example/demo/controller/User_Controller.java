package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Users;
import com.example.demo.service.User_Service;

@Controller
public class User_Controller {
    
    @Autowired
    private User_Service user_Service;

    @GetMapping("/save")
    public String saveUser(Model model) {
        // Add a new Users object to the model with the name "users"
        model.addAttribute("users", new Users());
        return "create_user";
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute("users") Users users) {
        user_Service.saveUser(users);
        return "redirect:/getAllUsers"; 
    }

    @GetMapping("/getAllUsers")
    public String getAllUsers(Model model) {
        List<Users> usersList = user_Service.getAllUsersList();
        model.addAttribute("users", usersList);
        return "user_list"; 
    }

}
