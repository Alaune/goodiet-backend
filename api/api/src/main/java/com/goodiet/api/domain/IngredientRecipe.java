package com.goodiet.api.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import com.goodiet.api.domain.IngredientRecipeIdClass;


@SuppressWarnings("serial")

@Entity
@IdClass(IngredientRecipeIdClass.class)
public class IngredientRecipe implements Serializable {

	@Id
	@ManyToOne
	private Recipe recipe;
	
	@Id
	@ManyToOne
	private Ingredient ingredient;
	
	private int quantity;
	
	private String extendedInfo;

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getExtendedInfo() {
		return extendedInfo;
	}

	public void setExtendedInfo(String extendedInfo) {
		this.extendedInfo = extendedInfo;
	}
	
	
	
}
