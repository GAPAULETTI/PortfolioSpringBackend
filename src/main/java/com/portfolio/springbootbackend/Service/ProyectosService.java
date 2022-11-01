/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.springbootbackend.Service;

import com.portfolio.springbootbackend.Repository.ProyectosRepository;
import com.portfolio.springbootbackend.model.Proyectos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gaston
 */
@Service
public class ProyectosService implements IProyectosService {
    @Autowired
    public ProyectosRepository repro;
    @Override
    public List<Proyectos> listar() {
        return repro.findAll();
    }

    @Override
    public Proyectos agregar(Proyectos proyecto) {
        return repro.save(proyecto);
        }

    @Override
    public Proyectos actualizar(Proyectos proyecto) {
        return repro.save(proyecto);    
    }

    @Override
    public void eliminar(Long id) {
           repro.deleteById(id);
    }
    
}
