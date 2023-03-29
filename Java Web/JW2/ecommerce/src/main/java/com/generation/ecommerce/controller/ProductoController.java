package com.generation.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.services.ProductoService;

// RestController par soportar métodos HTTP
@RestController

// RequestMapping para mapear la ruta que deben seguir los métodos HTTP
@RequestMapping(path= "/miOtzo/productos/")

public class ProductoController {
	
	// Crear una instancia de la clase ProductoService.
	// Con ello se genera la dependencia entre ambos para poder acceder a los métodos de ProductoService.
	// Private FINAL poque su valor no cambia después de ser inicializado ni durante la ejecución.
	
	private final ProductoService productoServicio;
	
	//Autowired se usa para inyectar una instancia de ProductoServicio en ProductoController. La inyecta y está disponible cuando se necesita.
	// Enlaza 
	
	@Autowired
	
	public ProductoController (ProductoService productoServicio) {
		this.productoServicio = productoServicio;
		
	}
	
	// HTTP Get
	@GetMapping
	public List<Producto> getProducto () {
		
		return productoServicio.leerProducto();
		
	}
	
	// HTTP Post
	//@PostMapping
	
	//public void postProducto () {
		
		//return productoServicio.crearProducto();
		
	//}
	
	// HTTP Put
	//@PutMapping
	//public void putProducto () {
		
		//return productoServicio.actualizarProducto();
		
	//}
	
	// HTTP Delete
	//@DeleteMapping
	//public void deleteProducto () {
		
		//return productoServicio.borrarProducto();
		
	//}

}