/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.springbootbackend.Service;

import com.portfolio.springbootbackend.Repository.EducacionRepository;
import com.portfolio.springbootbackend.model.Educacion;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    EducacionRepository edu;
    
    @Override
    public List<Educacion> listar() {
        return edu.findAll();
    }

    @Override
    public Educacion registrar(Educacion educacion) {
     return edu.save(educacion);
    }

    @Override
    public Educacion actualizar(Educacion educacion) {
     return edu.save(educacion);
    }

    @Override
    public void eliminar(Integer id) {
        edu.deleteById(id);
    }
  
   
    
}
