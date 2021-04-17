package com.goodiet.apirecetas.domain;

import java.awt.Image;

public class Receta {
	
	String name;
	String description;
	String ingredients;
	String instructions;
	int time;
	int rate;
	Image image;
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getIngredients() {
		return ingredients;
	}



	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}



	public String getInstructions() {
		return instructions;
	}



	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}



	public int getTime() {
		return time;
	}



	public void setTime(int time) {
		this.time = time;
	}



	public int getRate() {
		return rate;
	}



	public void setRate(int rate) {
		this.rate = rate;
	}



	public Image getImage() {
		return image;
	}



	public void setImage(Image image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "Receta [nombre=" + name + ", Descripción=" + description + ", Ingredientes=" + ingredients + ", Instrucciones="
				+ instructions + ", Tiempo=" + time + ", Puntuación=" + rate + ", Imagen=" + image + "]";
	}
	

}
