package com.goodiet.goodietbackend.domain.idclass;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Embeddable
public class IngredientRecipeIdClass implements Serializable {
	
	@Column(name = "recipe_id")
	private Long recipeId;
	
	@Column(name = "ingredient_id")
	private Long ingredientId;

	public IngredientRecipeIdClass() {
		super();
	}	

}
