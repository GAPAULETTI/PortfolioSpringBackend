
package com.portfolio.springbootbackend.Controller;

import com.portfolio.springbootbackend.Service.IExperienciaService;
import com.portfolio.springbootbackend.model.Experiencia;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IExperienciaService expServ;
    
    @PostMapping("/new/experiencia")
    public void agregarTrabajo(@RequestBody Experiencia exp){
     expServ.crearExperiencia(exp);
    }
    @GetMapping("/ver/experiencia")
    @ResponseBody 
    public List<Experiencia> verExperiencia (){
     return expServ.verExperiencia();
    }
    @DeleteMapping("/delete/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }
}
