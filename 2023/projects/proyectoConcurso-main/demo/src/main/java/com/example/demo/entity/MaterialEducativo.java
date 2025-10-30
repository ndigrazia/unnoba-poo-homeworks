package com.example.demo.entity;

import jakarta.persistence.*;


@Entity
public class MaterialEducativo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaterial;

    private String nombre;
    private String descripcion;
    private Long cantidadLike;
    
    public MaterialEducativo() {
        
    }
    
    
    public Long getId() {
        return this.idMaterial;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getIdMaterial() {
        return this.idMaterial;
    }

    public void setIdMaterial(Long idMaterial) {
        this.idMaterial = idMaterial;
    }

    public Long getCantidadLike() {
        return this.cantidadLike;
    }

    public void setCantidadLike(Long cantidadLike) {
        this.cantidadLike = cantidadLike;
    }

}
