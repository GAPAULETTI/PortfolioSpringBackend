
package com.portfolio.springbootbackend.Service;

import com.portfolio.springbootbackend.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
   
    public List <Experiencia> verExperiencia();
    Experiencia registrarExp(Experiencia exp);
    Experiencia actualizarExp(Experiencia exp);
    public void eliminarExp (Long id);
    
} 
