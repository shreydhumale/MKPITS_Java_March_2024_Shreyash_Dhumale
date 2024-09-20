package com.example.usersLog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.usersLog.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
