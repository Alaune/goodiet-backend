package com.goodiet.goodietbackend.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "Recipe")
@Table(name = "recipe")
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String description;
	
	private int rate;
	
	private int difficulty;
	
	private int timeTaken;
	
	private String steps;
	
	@ManyToOne
	private Category category;
	
    @OneToMany(mappedBy = "recipe", cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<IngredientRecipe> ingredients = new ArrayList<>();
	
}
