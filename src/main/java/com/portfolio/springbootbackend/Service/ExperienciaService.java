
package com.portfolio.springbootbackend.Service;

import com.portfolio.springbootbackend.Repository.ExperienciaRepository;
import com.portfolio.springbootbackend.model.Experiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    public ExperienciaRepository expRepo;
    
    @Override
    public List<Experiencia> verExperiencia() {
        return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
           expRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }
    
   
    
}
