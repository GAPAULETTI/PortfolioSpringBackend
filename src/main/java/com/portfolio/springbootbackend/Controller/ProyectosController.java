/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.springbootbackend.Controller;

import com.portfolio.springbootbackend.Service.IProyectosService;
import com.portfolio.springbootbackend.model.Proyectos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Gaston
 */
@RestController
@RequestMapping("/proyectos")
public class ProyectosController {
    
     @Autowired
    private IProyectosService serviceProject;
    
    @GetMapping
    public ResponseEntity<List<Proyectos>> listar(){
        List<Proyectos> obj = serviceProject.listar();
        return new ResponseEntity<List<Proyectos>>(obj, HttpStatus.OK);
    } 
    @PostMapping
    public ResponseEntity<Proyectos> agregar(@RequestBody Proyectos proyecto){
     Proyectos obj = serviceProject.agregar(proyecto);
     return new ResponseEntity<Proyectos>(obj, HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Proyectos> actualizar(@RequestBody Proyectos proyecto){
     Proyectos obj = serviceProject.actualizar(proyecto);
     return new ResponseEntity<Proyectos>(obj, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarExp(@PathVariable("id") Long id){
      serviceProject.eliminar(id);
     return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
    
}
