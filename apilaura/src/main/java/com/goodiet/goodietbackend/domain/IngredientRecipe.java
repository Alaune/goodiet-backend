package com.goodiet.goodietbackend.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.goodiet.goodietbackend.domain.idclass.IngredientRecipeIdClass;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity(name = "IngredientRecipe")
@Table(name = "ingredient_recipe")
@Embeddable
public class IngredientRecipe implements Serializable {

	@EmbeddedId
	private IngredientRecipeIdClass id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("ingredientId")
	private Ingredient ingredient;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("recipeId")
	private Recipe recipe;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "extended_info")
	private String extendedInfo;
	
}
