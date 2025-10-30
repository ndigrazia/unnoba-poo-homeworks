package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario{
    @Id
    @Column(columnDefinition = "VARCHAR(255)")
    private String mail;
    @Column(columnDefinition = "VARCHAR(255)")
    private String apellidoNombre;
    @Column(columnDefinition = "VARCHAR(255)")
    private String pass;
    @Column(columnDefinition = "VARCHAR(255)")
    private String telefono;
    @Enumerated(EnumType.STRING)
    private Rol rol;

    public Usuario() {
    }

    public String getApellidoNombre() {
        return this.apellidoNombre;
    }

    public void setApellidoNombre(String apellidoNombre) {
        this.apellidoNombre = apellidoNombre;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Rol getRol() {
        return this.rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

}