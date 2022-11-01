/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.springbootbackend.Service;

import com.portfolio.springbootbackend.model.Proyectos;
import java.util.List;

/**
 *
 * @author Gaston
 */
public interface IProyectosService {
    
     public List <Proyectos> listar();
    Proyectos agregar(Proyectos proyecto);
    Proyectos actualizar(Proyectos proyecto);
    public void eliminar(Long id);
}
