package com.goodiet.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.goodiet.api.domain.Ingredient;
import com.goodiet.api.repository.IngredientRepository;

@Service
public class IngredientService {
	
	@Autowired
	private IngredientRepository ingredientRepository;
	
	public Ingredient findByName(String name) {
		return ingredientRepository.findByName(name);
	}
	
}
