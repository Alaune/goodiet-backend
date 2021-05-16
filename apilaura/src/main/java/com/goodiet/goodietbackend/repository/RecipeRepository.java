package com.goodiet.goodietbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goodiet.goodietbackend.domain.Category;
import com.goodiet.goodietbackend.domain.Ingredient;
import com.goodiet.goodietbackend.domain.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
	
	public Recipe findByName(String nombre);
	
	public List<Recipe> findAllByName(String nombre);
	
	public List<Recipe> findAllByCategory(Category categoria);
	
}
