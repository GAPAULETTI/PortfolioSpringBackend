/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.springbootbackend.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Gaston
 */
@Getter @Setter
@Entity
@Table(name="proyectos")
public class Proyectos implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String nombre;
    @Column
    private Date periodo;
    @Column
    private Boolean finalizado;
    @Column
    private String descripcion;

    public Proyectos() {
    }
    
    

    public Proyectos(Long id, String nombre, Date periodo, Boolean finalizado, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.periodo = periodo;
        this.finalizado = finalizado;
        this.descripcion = descripcion;
    }
    
    
}
