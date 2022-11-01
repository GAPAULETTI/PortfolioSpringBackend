/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.springbootbackend.Service;

import com.portfolio.springbootbackend.model.Skills;
import java.util.List;

/**
 *
 * @author Gaston
 */
public interface ISkillsService {
    
    public List <Skills> listar();
    Skills agregar(Skills skill);
    Skills actualizar(Skills skill);
    public void eliminar(Integer id);
    
}
