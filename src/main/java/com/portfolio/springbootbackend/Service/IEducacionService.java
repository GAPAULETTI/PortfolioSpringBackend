/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.springbootbackend.Service;

import com.portfolio.springbootbackend.model.Educacion;
import java.util.List;

/**
 *
 * @author Gaston
 */
public interface IEducacionService {
    
    List<Educacion> listar();
    Educacion registrar(Educacion educacion);
    Educacion actualizar(Educacion educacion);
    void eliminar(Integer idEducacion);
    
}
