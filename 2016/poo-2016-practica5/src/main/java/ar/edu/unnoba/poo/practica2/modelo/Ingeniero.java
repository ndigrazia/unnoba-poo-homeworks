package ar.edu.unnoba.poo.practica2.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("I")
public class Ingeniero extends Responsable {

  private int retp;

  public Ingeniero() {
  }

  public Ingeniero(String matriculaProvincial, String descripcion, 
		  Persona persona, float valorHora, int retp) {
	super(matriculaProvincial, descripcion, persona, valorHora);
	this.retp = retp;
  }

  public int getRetp() {
	  return retp;
  }
  
  public void setRetp(int retp) {
	  this.retp = retp;
  }
 
}