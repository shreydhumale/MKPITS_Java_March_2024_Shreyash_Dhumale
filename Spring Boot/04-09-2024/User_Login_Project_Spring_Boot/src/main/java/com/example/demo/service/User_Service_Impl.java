package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Role;
import com.example.demo.entity.Users;
import com.example.demo.repository.Role_Repository;
import com.example.demo.repository.User_Repository;

@Service
public class User_Service_Impl implements User_Service {

    @Autowired
    private User_Repository user_Repository;

    @Autowired
    private Role_Repository role_Repository;

    @Override
    @Transactional
    public Users saveUser(Users users) {
        // Check if the role is new and needs to be saved
        Role role = users.getRole();
        if (role != null && role.getRoleId() == 0) {
            role = role_Repository.save(role);  // Save the role first
            users.setRole(role);  // Set the saved role to the user
        }

        return user_Repository.save(users);
    }

    @Override
    public List<Users> getAllUsersList() {
        return user_Repository.findAll();
    }
}
