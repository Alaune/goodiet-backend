package com.goodiet.goodietbackend.utils;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.goodiet.goodietbackend.domain.Category;
import com.goodiet.goodietbackend.domain.Recipe;

/**
 * Clase de utilidades para las recetas
 * 
 * @author Laura
 * @since 17/04/21
 */
@Component
public class GoodietUtils {

	/**
	 * Método de comprobación de la validez de una receta
	 * 
	 * @param recipe Receta a validar
	 * @return isValid
	 */
	public boolean isValidRecipe(Recipe recipe) {
		boolean isValid = true;
		
		if (!StringUtils.hasText(recipe.getName()) || recipe.getCategory() == null) {
			isValid = false;
		}
		
		return isValid;
	}
	
	/**
	 * Método de comprobación de la validez de una categoría
	 * 
	 * @param category Categoría a validar
	 * @return isValid
	 */
	public boolean isValidCategory(Category category) {
		boolean isValid = true;
		
		if (!StringUtils.hasText(category.getName())) {
			isValid = false;
		}
		
		return isValid;
	}
	
}
