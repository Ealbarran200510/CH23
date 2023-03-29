package com.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Clase = Plantilla
// Objeto = Producto de la clase (Tiene atributos y comportamiento)

// Herencia. Las clases pueden heredar atributos y funcionalidad a otras clases inferiores
// Java no permite la herencia múltiple, para ello se implementa una interfaz (extends)
// (Clase) extends (SuperClase1) implements (SuperClass2)

// Polimorfismo. Las clases abstractas (un objetivo, distintas maneras de hacerlo-las define el objeto) pueden utilizarse para distintos fines.
// Las clases abstractas pueden combinar métodos abstractos y específicos. 
// Las interfaces solo pueden contener métodos abstractos. Son un puente entre el usuario y los métodos específicos (solo envía órdenes, no contiene el cómo ejecutarlas)

// Sobrecarga de métodos. Es posible generar 2 métodos con el mismo nombre, pero con distintos parámetros.
// Sobreescritura de métodos. Se manda a llamar un método que ya existe para ser utilizado dentro de una clase.

// 1. Crear la clase dentro del modelo

// Entity convierte a Producto en una entidad JPA para Persistencia de Datos
@Entity

// En Table se especifica exactamente igual el nombre de la tabla en la DBA
@Table

public class Producto {
	
	// ID = Primary Key
	@Id
	
	// El campo ID será generado automáticamente por la DBA
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	// Especifica el nombre de la columna en la DBA
	@Column(name = "id", unique = true, nullable = false)
	
	private Long id;
	private String nombre;
	private String descripcion;
	private String URL_Imagen;
	private double precio;
	
	// Se crea un constructor vacío para serealizar y deserializar el objeto a través de la biblioteca Jackson
	
	public Producto() {
		
	}
	
	// Después se crea el constructor con todos los parámetros del objeto

	public Producto(Long id, String nombre, String descripcion, String uRL_Imagen, double precio) {
		
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.URL_Imagen = URL_Imagen;
		this.precio = precio;
	}
	
	// Se crean get y set para todos los campos

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getURL_Imagen() {
		return URL_Imagen;
	}

	public void setURL_Imagen(String uRL_Imagen) {
		URL_Imagen = uRL_Imagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//toString(Sobreescritura de Métodos)
		@Override
		public String toString() {
			return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", uRL_Imagen="
					+ URL_Imagen + ", precio=" + precio + "]";
		}

}
