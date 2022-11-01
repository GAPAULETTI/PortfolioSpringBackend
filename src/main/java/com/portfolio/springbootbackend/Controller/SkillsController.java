/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.springbootbackend.Controller;

import com.portfolio.springbootbackend.Service.SkillsService;
import com.portfolio.springbootbackend.model.Skills;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gaston
 */
@RestController
@RequestMapping("/skills")
public class SkillsController {
    
    @Autowired
    private SkillsService service;
    
    @GetMapping
    public ResponseEntity<List<Skills>> listar(){
        List<Skills> obj=service.listar();
        return new ResponseEntity<List<Skills>>(obj, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Skills> agregar(@RequestBody Skills skill){
     Skills obj = service.agregar(skill);
     return new ResponseEntity<Skills>(obj, HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Skills> actualizar(@RequestBody Skills skill){
     Skills obj = service.actualizar(skill);
     return new ResponseEntity<Skills>(obj, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id){
      service.eliminar(id);
     return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
    
    
}
