package com.example.app.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.app.model.Libro;

@Repository
public class LibroRepository {
	
	public List<Libro> listar () {
		
		List<Libro> lista = new ArrayList<Libro>();
		
		lista.add(new Libro("Spring", "Autor", "1"));
		lista.add(new Libro("Spring Boot", "Autor2", "2"));
		lista.add(new Libro("C", "Autor3", "3"));
		return lista;
		
	}

}
