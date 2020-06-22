package ar.edu.unnoba.poo.practica2.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("M")
public class MaestroMayorDeObra extends Responsable {

  @Enumerated(EnumType.STRING)
  public NivelDeExperiencia nivelExperiencia;

  public MaestroMayorDeObra() {
  }

  public MaestroMayorDeObra(String matriculaProvincial, String descripcion, 
		  Persona persona, float valorHora, NivelDeExperiencia nivelExperiencia) {
	super(matriculaProvincial, descripcion, persona, valorHora);
	this.nivelExperiencia=nivelExperiencia;
  }

  public NivelDeExperiencia getNivelExperiencia() {
	return nivelExperiencia;
  }

  public void setNivelExperiencia(NivelDeExperiencia nivelExperiencia) {
	this.nivelExperiencia = nivelExperiencia;
  }
  
}