package ar.edu.unnoba.poo.practica2.modelo;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class Arquitecto extends Responsable {

  private Date fechaVencimientoMatricula;
  
  public Arquitecto() {
  }

  public Arquitecto(String matriculaProvincial, String descripcion,
		  Persona persona, float valorHora, Date fechaVencimientoMatricula) {
	super(matriculaProvincial, descripcion, persona, valorHora);
	this.fechaVencimientoMatricula = fechaVencimientoMatricula;
  }

  public Date getFechaVencimientoMatricula() {
	return fechaVencimientoMatricula;
  }

  public void setFechaVencimientoMatricula(Date fechaVencimientoMatricula) {
	this.fechaVencimientoMatricula = fechaVencimientoMatricula;
  }

}