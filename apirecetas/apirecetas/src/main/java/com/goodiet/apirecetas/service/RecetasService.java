package com.goodiet.apirecetas.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.goodiet.apirecetas.domain.Receta;

@Service
public class RecetasService {
	
	List<Receta> recetas = new ArrayList<Receta>();

	public RecetasService() throws IOException {
		Receta receta = new Receta();
		receta.setName("Patatas Bravas");
		receta.setDescription("En Madrid, las bravas son una institución, un imprescindible en su gastronomía. No faltan en ninguna carta de bar, cafetería, tapería o restaurante que se precie en el arte del tapeo. Podemos encontrar muchos tipos de patatas bravas, desde esta receta clásica, la que incorpora salsa de tomate picante o las que llaman bravas con dos salsas. Animaos a prepararlas.");
		receta.setIngredients("1 Kg. de patatas especiales para freír o fritura\r\n"
				+ "Aceite de oliva virgen extra (el necesario para confitar y luego freír las patatas)\r\n"
				+ "Para la salsa brava o picante: 4 cucharadas de aceite de oliva virgen extra\r\n"
				+ "2 cucharadas de pimentón de la Vera dulce\r\n"
				+ "1 cucharada de pimentón de la Vera picante\r\n"
				+ "1 cucharada de harina fina de maíz\r\n"
				+ "200 ml. de caldo de carne\r\n"
				+ "1 cucharadita de sal");
		receta.setInstructions("Pelamos las patatas, las lavamos, escurrimos y secamos bien con un trapo de algodón o papel. Las cortamos de forma tosca, en cubos del tamaño de un bocado, aproximadamente en dados de unos 5 cm de grosor.\r\n"
				+ "Ponemos un cazo grande y vertemos abundante aceite de oliva virgen extra, más o menos por encima de la mitad de la capacidad del cazo.\r\n"
				+ "Añadimos las patatas en el aceite en frío y dejamos que se caliente a temperatura media. Bajamos el fuego al mínimo y las vamos a confitar en el aceite muy lentamente durante 15 minutos. Cuando ya estén tiernas las sacamos del cazo con un escurridor y reservamos. Mientras se van enfriando las patatas, vamos con la salsa brava.");
		receta.setTime(25);
		receta.setRate(3);
		receta.setImage(null);
		


		recetas.add(receta);
	}
	
	public Receta getReceta(int id) {
		return recetas.get(id-1);
	}
	
	public int add(Receta receta) {
		recetas.add(receta);
		return recetas.size();
	}

	public List<Receta> getRecetas() {
		return recetas;
	}
	
	public void guarda(int id, Receta receta ) {
		recetas.set(id-1, receta);
	}
	
	public void borra(int id) {
		recetas.remove(id-1);
	}
	
	public  List<Receta> buscaPorNombre(String name) {
		
		List<Receta> recetasResultado = new ArrayList<Receta>();	
		for(Receta receta: recetas) {
			if( receta.getName().contains(name)) {
				recetasResultado.add(receta);
			}
		}
		return recetasResultado;	
	}
	

}