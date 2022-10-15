
package com.portfolio.springbootbackend.Service;

import com.portfolio.springbootbackend.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
   
    public List <Experiencia> verExperiencia();
    public void crearExperiencia (Experiencia exp);
    public void borrarExperiencia (Long id);
    public Experiencia buscarExperiencia (Long id);
}
