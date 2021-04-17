package com.goodiet.goodietbackend.domain.idclass;

import java.io.Serializable;

import com.goodiet.goodietbackend.domain.Ingredient;
import com.goodiet.goodietbackend.domain.Recipe;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class IngredientRecipeIdClass implements Serializable {
	
	private Ingredient ingredient;
	
	private Recipe recipe;

	public IngredientRecipeIdClass() {
		super();
	}
	
	

}
