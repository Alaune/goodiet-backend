package com.goodiet.goodietbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goodiet.goodietbackend.domain.Ingredient;
import com.goodiet.goodietbackend.domain.IngredientRecipe;
import com.goodiet.goodietbackend.domain.Recipe;
import com.goodiet.goodietbackend.repository.IngredientRecipeRepository;

@Service
public class IngredientRecipeService {
	
	@Autowired
	private IngredientRecipeRepository ingredientRecipeRepository;

	public IngredientRecipe findByIngredient(Ingredient ingrediente) {
		return ingredientRecipeRepository.findByIngredient(ingrediente);
	}
	
	public List<IngredientRecipe> findAllByIngredient(Ingredient ingrediente) {
		return ingredientRecipeRepository.findAllByIngredient(ingrediente);
	}
	
	public IngredientRecipe findByRecipe(Recipe receta) {
		return ingredientRecipeRepository.findByRecipe(receta);
	}
	
	public List<IngredientRecipe> findAllByRecipe(Recipe receta) {
		return ingredientRecipeRepository.findAllByRecipe(receta);
	}
}
