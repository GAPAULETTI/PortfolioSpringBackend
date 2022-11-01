
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
    public Experiencia registrarExp(Experiencia exp) {
           return expRepo.save(exp);
    }
    

    @Override
    public void eliminarExp(Long id) {
        expRepo.deleteById(id);
    }

    

    @Override
    public Experiencia actualizarExp(Experiencia exp) {
     return expRepo.save(exp);
    }
    
   
    
}
