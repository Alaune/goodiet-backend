package com.goodiet.goodietbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goodiet.goodietbackend.domain.Ingredient;
import com.goodiet.goodietbackend.domain.IngredientRecipe;
import com.goodiet.goodietbackend.domain.Recipe;

public interface IngredientRecipeRepository extends JpaRepository<IngredientRecipe, Long> {
	
	public IngredientRecipe findByIngredient(Ingredient ingrediente);
	
	public List<IngredientRecipe> findAllByIngredient(Ingredient ingrediente);
	
	public IngredientRecipe findByRecipe(Recipe receta);
	
	public List<IngredientRecipe> findAllByRecipe(Recipe receta);

}
