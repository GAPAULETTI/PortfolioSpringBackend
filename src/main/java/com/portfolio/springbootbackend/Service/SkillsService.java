/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.springbootbackend.Service;

import com.portfolio.springbootbackend.Repository.SkillsRepository;
import com.portfolio.springbootbackend.model.Skills;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gaston
 */
@Service
public class SkillsService implements ISkillsService {
    @Autowired
    public SkillsRepository skillRepo;
    
    @Override
    public List<Skills> listar() {
    return skillRepo.findAll();
    }

    @Override
    public Skills agregar(Skills skill) {
        return skillRepo.save(skill);
    }

    @Override
    public Skills actualizar(Skills skill) {
        return skillRepo.save(skill);
    }

    @Override
    public void eliminar(Integer id) {
           skillRepo.deleteById(id);
    }
    
}
