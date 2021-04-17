package com.goodiet.goodietbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goodiet.goodietbackend.domain.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
