package com.ch23.jpa.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ch23.jpa.model.UsuarioModel;
import com.ch23.jpa.repository.UsuarioRepository;

@Service
public class UsuarioServices {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public ArrayList <UsuarioModel> busquedaPrio (Integer prio) {
		return usuarioRepository.busquedaPrio(prio);
		
	}
	
	public ArrayList <UsuarioModel> Listar() {
		
		return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
		
	}

}
