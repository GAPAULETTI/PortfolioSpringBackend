
package com.portfolio.springbootbackend.Controller;

import com.portfolio.springbootbackend.Service.IExperienciaService;
import com.portfolio.springbootbackend.model.Experiencia;
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
@RequestMapping("/experiencia")
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService serviceExp;
    
    @GetMapping
    public ResponseEntity<List<Experiencia>> verExperiencia(){
        List<Experiencia> obj = serviceExp.verExperiencia();
        return new ResponseEntity<List<Experiencia>>(obj, HttpStatus.OK);
    } 
    @PostMapping
    public ResponseEntity<Experiencia> registrarExp(@RequestBody Experiencia exp){
     Experiencia obj = serviceExp.registrarExp(exp);
     return new ResponseEntity<Experiencia>(obj, HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Experiencia> actualizarExp(@RequestBody Experiencia exp){
     Experiencia obj = serviceExp.actualizarExp(exp);
     return new ResponseEntity<Experiencia>(obj, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarExp(@PathVariable("id") Long id){
      serviceExp.eliminarExp(id);
     return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
    

}
