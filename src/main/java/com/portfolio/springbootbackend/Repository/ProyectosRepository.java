/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.springbootbackend.Repository;

import com.portfolio.springbootbackend.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Gaston
 */
@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos, Long> {
    
}
