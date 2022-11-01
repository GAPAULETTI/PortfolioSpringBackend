package com.portfolio.springbootbackend.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="educacion")
public class Educacion implements Serializable {
     
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idEducacion;
    
    @Column(name="titulo", length=100, nullable=false)
    private String titulo;
    @Column(name="institucion", length=100, nullable=false)
    private String institucion;
   
    @Column
    
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fechaInicio;
    
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    
    private Date fechaFin;
    
    @Column(name="descripcion", length=300, nullable=false)
    private String descripcion;

    public Educacion() {
    }
    
    

    public Educacion(Integer idEducacion, String titulo, String institucion, Date fechaInicio, Date fechaFin, String descripcion) {
        this.idEducacion = idEducacion;
        this.titulo = titulo;
        this.institucion = institucion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }

    public Integer getIdEducacion() {
        return idEducacion;
    }

    public void setIdEducacion(Integer idEducacion) {
        this.idEducacion = idEducacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
      
}
