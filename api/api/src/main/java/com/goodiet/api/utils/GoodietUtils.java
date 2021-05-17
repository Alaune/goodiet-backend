package com.goodiet.api.utils;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import com.goodiet.api.domain.Category;
import com.goodiet.api.domain.Recipe;

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
		
		return isValid;
	}
	
}
