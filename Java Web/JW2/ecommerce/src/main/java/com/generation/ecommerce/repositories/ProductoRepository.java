package com.generation.ecommerce.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generation.ecommerce.model.Producto;

//Extendemos de la interface JPA, que maneja la entidad Producto y su atributo Long
// Esto permite utilizar Query's predefinidas dentro de JPA

public interface ProductoRepository extends JpaRepository <Producto,Long> {
	
	// Query personalizada en JPQL
	@Query("SELECT p FROM Producto p WHERE p.nombre=?1")
	
	// Optional contiene el objeto Producto si lo encuentra o se queda vacío si el Query no encuentra nada. Maneja la excepción.
	Optional<Producto> findByNombre(String nombre);

}
