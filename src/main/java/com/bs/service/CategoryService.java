package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public List<String> retrieveSubCategories(String category) {
		return categoryRepository.findOne(category.toUpperCase()).getSubCategories();
	}

}
