package com.goodiet.goodietbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goodiet.goodietbackend.repository.IngredientRecipeRepository;

@Service
public class IngredientRecipeService {
	
	@Autowired
	private IngredientRecipeRepository ingredientRecipeRepository;
	

}
