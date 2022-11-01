            
package com.portfolio.springbootbackend.Controller;

import com.portfolio.springbootbackend.Service.IEducacionService;
import com.portfolio.springbootbackend.model.Educacion;
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


@RestController
@RequestMapping("/educacion")
public class EducacionController {
    
    @Autowired
    private IEducacionService service;
    
    @GetMapping 
    public ResponseEntity<List<Educacion>> listar(){
        List<Educacion> obj = service.listar();
        return new ResponseEntity<List<Educacion>>(obj, HttpStatus.OK);
    }
         
    @PostMapping
    public ResponseEntity<Educacion> registrar(@RequestBody Educacion educacion){
     Educacion obj = service.registrar(educacion);
     return new ResponseEntity<Educacion>(obj, HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Educacion> actualizar(@RequestBody Educacion educacion){
     Educacion obj= service.actualizar(educacion);
     return new ResponseEntity<Educacion>(obj, HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}") 
    public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id){
      service.eliminar(id);
     return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
