package ar.edu.unnoba.poo.practica2.modelo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
@Inheritance
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.CHAR)
@DiscriminatorValue("R")
public class Responsable extends GenericoEntity {

  @Id
  @Column(nullable = false)
  private String matriculaProvincial;
  private String descripcion;
  private float valorHora;
  
  @ManyToOne(fetch=FetchType.LAZY)
  private Persona persona;
  
  @Version
  protected int version;
  
  public Responsable() {
  }
  
  public Responsable(String matriculaProvincial, String descripcion, Persona persona, float valorHora) {
	this.matriculaProvincial = matriculaProvincial;
	this.descripcion = descripcion;
	this.persona = persona;
	this.valorHora = valorHora;
  }

  public String getMatriculaProvincial() {
	return matriculaProvincial;
  }
  
  public void setMatriculaProvincial(String matriculaProvincial) {
	this.matriculaProvincial = matriculaProvincial;
  }

  public String getDescripcion() {
	return descripcion;
  }

  public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
  }

  public Persona getPersona() {
	return persona;
  }

  public void setPersona(Persona persona) {
	this.persona = persona;
  }

  public float getValorHora() {
	return valorHora;
  }
  
  public void setValorHora(float valorHora) {
	this.valorHora = valorHora;
  }
    
}