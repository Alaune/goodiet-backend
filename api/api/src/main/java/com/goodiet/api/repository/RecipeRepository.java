package com.goodiet.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goodiet.api.domain.Category;
import com.goodiet.api.domain.Ingredient;
import com.goodiet.api.domain.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
	
	public Recipe findByName(String nombre);
	
	public List<Recipe> findAllByName(String nombre);
	
	public List<Recipe> findAllByCategory(Category categoria);
	
	public List<Recipe> findAllByIngredient(Ingredient ingredient);

}
