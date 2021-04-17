package com.goodiet.goodietbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goodiet.goodietbackend.domain.Recipe;
import com.goodiet.goodietbackend.repository.RecipeRepository;
import com.goodiet.goodietbackend.utils.GoodietUtils;

@Service
public class RecipeService {
	
	@Autowired
	private RecipeRepository recipeRepository;
	
	@Autowired
	private GoodietUtils goodietUtils;
	
	/**
	 * Devuelve todas las recetas
	 * 
	 * @return
	 */
	public List<Recipe> findAll() {
		return recipeRepository.findAll();
	}
	
	/**
	 * Devuelve la receta cuyo id es el pasado como parámetro
	 * @param id
	 * @return
	 */
	public Recipe findById(Long id) {
		return recipeRepository.findById(id).orElse(null);
	}
	
	/**
	 * Creación y guardado de Recipe
	 * 
	 * @param recipe
	 */
	public Recipe saveRecipe(Recipe recipe) {
		if (goodietUtils.isValidRecipe(recipe)) {
			recipeRepository.save(recipe);
		}
		
		return recipe;
	}

}
