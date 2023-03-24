package com.ch23.jpa.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ch23.jpa.model.UsuarioModel;
@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long>{
    
    public ArrayList<UsuarioModel> findByPrioridad (Integer prioridad);

}