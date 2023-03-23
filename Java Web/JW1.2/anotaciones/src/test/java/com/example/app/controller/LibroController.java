package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.Libro;
import com.example.app.repository.LibroRepository;

@RestController
public class LibroController {
	@Autowired
	LibroRepository objLR;

	@RequestMapping("/libros")
	
	public List<Libro> listar () {
		
		return objLR.listar();
	}

}
