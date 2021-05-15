package com.goodiet.goodietbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goodiet.goodietbackend.domain.Ingredient;
import com.goodiet.goodietbackend.repository.IngredientRepository;

@Service
public class IngredientService {
	
	@Autowired
	private IngredientRepository ingredientRepository;
	
	public Ingredient findByName(String name) {
		return ingredientRepository.findByName(name);
	}
	
}
