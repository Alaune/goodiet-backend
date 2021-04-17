package com.goodiet.apirecetas.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.goodiet.apirecetas.domain.Receta;
import com.goodiet.apirecetas.service.RecetasService;
import com.goodiet.apirecetas.web.error.CustomError;


@RestController
public class RecetasController {
	
	@Autowired 
	RecetasService recetasService;			

	/*@GetMapping(path = "/recetas")
	List<Receta> getRecetas(@RequestParam(required = false) String name, @RequestParam(required = false, name = "puntuacion.min", defaultValue = "2") int puntuacionMinima ){	
		
		if (puntuacionMinima<2) {
			throw new CustomError("La puntuacion no puede ser menor que 2");			
		}			
		if( name!= null) {						
			return recetasService.buscaPorNombre(name);			
		}else return recetasService.getRecetas();		
	}*/
	
	@GetMapping(path = "/recetas")
	List<Receta> getRecetas() {			
		return recetasService.getRecetas();		
	}
	
	
	@GetMapping(path = "/recetas/{id}")
	Receta getRecetas(@PathVariable int id){			
		return recetasService.getReceta(id);		
	}
	
	@PostMapping(path = "/recetas")
	int altaReceta(@RequestBody Receta receta ) {				
		return recetasService.add(receta);		
	}
	
	@PutMapping(path = "/recetas/{id}")
	Receta modificaReceta(@RequestBody Receta receta,@PathVariable int id) {
		recetasService.guarda(id, receta);			
		return receta;		
	}
	
	@DeleteMapping(path="/recetas/{id}")
	String borraReceta(@PathVariable int id) {	
		recetasService.borra(id);	
		return("OK");
	}
	
	@GetMapping(path = "/recetasHeader")
	ResponseEntity<List<Receta>> getRecetasHeader(){		
		HttpHeaders headers = new HttpHeaders();
		headers.add("MiHeaderRespuesta", "HeaderRespuesta");
		
		return ResponseEntity.ok().headers(headers).body(recetasService.getRecetas());
	}
	
	
	

}