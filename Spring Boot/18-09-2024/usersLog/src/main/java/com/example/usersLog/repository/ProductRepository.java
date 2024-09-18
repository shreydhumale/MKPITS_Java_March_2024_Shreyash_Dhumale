package com.example.usersLog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.usersLog.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
}
