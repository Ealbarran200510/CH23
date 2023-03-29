package com.generation.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.repositories.ProductoRepository;

// 
@Service

public class ProductoService {
	
	// Crear el objeto de la clase PoductoRepository
	private final ProductoRepository productoRepository;
	
	// Cablear con Autowired
	@Autowired
	
	// Usar el objeto como parámetro en un constructor
	public ProductoService (ProductoRepository productoRepository) {
		
		this.productoRepository = productoRepository;
	}
	
	
	// Create
	public void crearProducto () {
		
	}
	
	// Read
	public List<Producto> leerProducto () {
		
		return productoRepository.findAll(); // Método para traer la lista de productos
		
	}
	
	// Leer con ID específico
	
	public Producto leerProducto(Long productoId) {
		
		return productoRepository.findById(productoId).orElseThrow(() -> new IllegalStateException("El producto " + "con el id " + productoId + " no existe."));
	}
	
	// Update
	public void actualizarProducto () {
		
	}
	
	// Delete
	public void borrarProducto () {
		
	}
	
}
