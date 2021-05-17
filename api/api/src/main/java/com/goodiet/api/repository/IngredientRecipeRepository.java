package com.goodiet.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goodiet.api.domain.IngredientRecipe;

public interface IngredientRecipeRepository extends JpaRepository<IngredientRecipe, Long>{

}
