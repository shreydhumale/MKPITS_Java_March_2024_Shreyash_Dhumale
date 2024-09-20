package com.example.usersLog.service;

import java.util.List;

import com.example.usersLog.entity.Category;

public interface CategoryService {
	public Category saveCategory(Category category);
	
	public List<Category>getAllCategories();
}
