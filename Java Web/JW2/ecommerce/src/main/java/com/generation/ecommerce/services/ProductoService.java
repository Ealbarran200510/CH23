package com.generation.ecommerce.services;

import java.util.List;
import java.util.Optional;

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
	public void crearProducto (Producto producto) {
		
		// Buscar producto en la DB por nombre con Optional
		Optional <Producto> productoByName = 
				productoRepository.findByNombre(producto.getNombre());
		
		// Si existe, se lanza el mensaje de que ya existe
		if(productoByName.isPresent()) {
				
			throw new IllegalStateException("El producto ya existe");
		} 
		
		// Si el producto no existe, entonces se guarda con save en la DB
		
		else {
			
			productoRepository.save(producto);
		}
		
	}
	
	// Read
	public List<Producto> leerProductos () {
		
		return productoRepository.findAll(); // Método para traer la lista de productos
		
	}
	
	// Leer con ID específico
	
	public Producto leerProducto(Long productoId) {
		
		return productoRepository.findById(productoId).orElseThrow(() -> new IllegalStateException("El producto " + "con el id " + productoId + " no existe."));
	}
	
	// Update
	public void actualizarProducto (Long productoId, String nombre, String descripcion, String URL_Imagen, double precio) {
		
		// Condicional: Si el producto existe
		if(productoRepository.existsById(productoId)) {
			
			// Se actualiza el producto
			Producto productoABuscar = productoRepository.getById(productoId);
			
			// Una vez verificado que existe, se asigna a la variable productoABuscar
			
			if(nombre!=null) productoABuscar.setNombre(nombre);
			if(descripcion!=null) productoABuscar.setDescripcion(descripcion);
			if(precio!=0) productoABuscar.setPrecio(precio);
			if(URL_Imagen!=null) productoABuscar.setURL_Imagen(URL_Imagen);
			
			//Una vez modificado, el producto se guarda con save
			productoRepository.save(productoABuscar);
				
		} else {
			
			System.out.println("El producto con el id= " + productoId + " no existe");
		}
		
	}
	
	// Delete
	public void borrarProducto (Long productoId) {
		
		if(productoRepository.existsById(productoId)) {
			
			productoRepository.deleteById(productoId);
			
		}
		
	}
	
}
