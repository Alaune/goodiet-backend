package com.goodiet.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.goodiet.api.repository.IngredientRecipeRepository;

@Service
public class IngredientRecipeService {
	
	@Autowired
	private IngredientRecipeRepository ingredientRecipeRepository;
	

}
