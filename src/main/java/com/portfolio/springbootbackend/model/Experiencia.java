
package com.portfolio.springbootbackend.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cargo;
    private String empresa;
    private String ciudad;
    private Date inicio;
    private Date finalizacion;
    private String tareasRealizadas;

    public Experiencia() {
    }

    public Experiencia(Long id, String cargo, String empresa, String ciudad, String tareasRealizadas) {
        this.id = id;
        this.cargo = cargo;
        this.empresa = empresa;
        this.ciudad = ciudad;
        this.tareasRealizadas = tareasRealizadas;
    }
    

    public Experiencia(Long id, String cargo, String empresa, String ciudad, Date inicio, Date finalizacion, String tareasRealizadas) {
        this.id = id;
        this.cargo = cargo;
        this.empresa = empresa;
        this.ciudad = ciudad;
        this.inicio = inicio;
        this.finalizacion = finalizacion;
        this.tareasRealizadas = tareasRealizadas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFinalizacion() {
        return finalizacion;
    }

    public void setFinalizacion(Date finalizacion) {
        this.finalizacion = finalizacion;
    }

    public String getTareasRealizadas() {
        return tareasRealizadas;
    }

    public void setTareasRealizadas(String tareasRealizadas) {
        this.tareasRealizadas = tareasRealizadas;
    }
    
    
    
}
