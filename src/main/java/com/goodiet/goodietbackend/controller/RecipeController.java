package com.goodiet.goodietbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goodiet.goodietbackend.domain.Recipe;
import com.goodiet.goodietbackend.service.RecipeService;

@RequestMapping("/api/v1/recipes")
@RestController
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;
	
    @GetMapping
    public List<Recipe> findAll() {
        return recipeService.findAll();
    }
        
    @GetMapping("/{id}")
    public Recipe findOne(@PathVariable Long id) {
        return recipeService.findById(id);
    }
    
    @PostMapping
    public Recipe create(@RequestBody Recipe recipe) {
        return recipeService.saveRecipe(recipe);
    }

}
