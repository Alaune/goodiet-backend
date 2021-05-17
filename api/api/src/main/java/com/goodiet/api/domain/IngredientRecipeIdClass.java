package com.goodiet.api.domain;

import java.io.Serializable;
import com.goodiet.api.domain.Ingredient;
import com.goodiet.api.domain.Recipe;


@SuppressWarnings("serial")

public class IngredientRecipeIdClass implements Serializable {
	
	private Ingredient ingredient;
	
	private Recipe recipe;

	public IngredientRecipeIdClass() {
		super();
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	
	

}
