package com.goodiet.goodietbackend.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

import com.goodiet.goodietbackend.domain.idclass.IngredientRecipeIdClass;

import lombok.Data;

@SuppressWarnings("serial")
@Data
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
	
}
