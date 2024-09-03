package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.User_details;
import com.example.demo.entity.Users;
import com.example.demo.repository.User_Details_Repository;
import com.example.demo.repository.User_Repository;

@Service
public class User_Service_Impl implements User_Service {

    @Autowired
    private User_Repository user_Repository;

    @Autowired
    private User_Details_Repository user_Details_Repository;

    @Override
    @Transactional
    public Users saveUser(Users users) {
//        User_details userDetails = users.getUser_details();
//            userDetails.setUser(users); 
//            user_Details_Repository.save(userDetails);
    		return user_Repository.save(users);
    }

    @Override
    public List<Users> getAllUsersList() {
        return user_Repository.findAll();
    }
}
