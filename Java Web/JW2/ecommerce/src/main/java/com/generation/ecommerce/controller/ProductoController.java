package com.generation.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.services.ProductoService;

// CrossOrigin indica que se realizarán conexiones cruzadas entre servidores
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,
        RequestMethod.PUT })

// RestController para soportar métodos HTTP
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
	// Mostrar todos los productos
	@GetMapping
	public List<Producto> getProducto () {
		
		return productoServicio.leerProductos();
		
	}
	
	// HTTP Get
	// Mostrar un solo producto
	@GetMapping(path = "{productoId}")
	public Producto getProducto (@PathVariable ("productoId")Long productoId) {
			
		return productoServicio.leerProducto(productoId);
			
	}
	
	// HTTP Post
	@PostMapping
	
	// Se agrega SOLAMENTE el cuerpo del producto
	public void postProducto (@RequestBody Producto producto) {
		
		// Se modifica el producto en la DB utilizando el cuerpo del producto a través de Crud
		productoServicio.crearProducto(producto);
		
	}
	
	// HTTP Put
	@PutMapping(path = "{productoId}") // http://localhost:8080/miOtzo/productos/
	public void putProducto (@PathVariable ("productoId") Long productoId,
			@RequestParam(required=false) String nombre,
			@RequestParam(required=false) String descripcion,
			@RequestParam(required=false) double precio,
			@RequestParam(required=false) String URL_Imagen
			) {
		
		productoServicio.actualizarProducto(productoId, nombre, descripcion, URL_Imagen, precio);
		
	}
	
	// HTTP Delete
	// Path borra elementos por Id utilizando la ruta: /productos/Id
	@DeleteMapping(path = "{productoId}")
	public void deleteProducto (@PathVariable ("productoId")Long productoId) {
		
		productoServicio.borrarProducto(productoId);
		
	}

}